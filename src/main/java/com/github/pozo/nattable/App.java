package com.github.pozo.nattable;

import java.util.List;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.CompositeLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.stack.DefaultBodyLayerStack;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.github.pozo.domain.Module;
import com.github.pozo.repository.ModuleRepository;

public class App {
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 
	*/
	public static void main(String[] args) {
		
		try {
			App window = new App();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 200);
		
		NatTable natTable = createExampleControl(shell);
        
		shell.setLayout(new GridLayout());
		
        GridDataFactory.fillDefaults().grab(true, true).applyTo(shell);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);
		
		shell.setText("Nattable tutorial");

	}
    public NatTable createExampleControl(Composite parent) {
        final List<Module> modules = ModuleRepository.getModules();

        // build the body layer stack
		IDataProvider bodyDataProvider = new BodyDataProvider(modules);
		DataLayer bodyDataLayer = new DataLayer(bodyDataProvider);
        DefaultBodyLayerStack bodyLayerStack = new DefaultBodyLayerStack(bodyDataLayer);
        
        // build the column header layer stack
        IDataProvider columnHeaderDataProvider = new ColumnHeaderProvider(modules);
        ILayer columnHeaderLayerStack = new ColumnHeaderLayer(
        		new DataLayer(columnHeaderDataProvider), 
                bodyLayerStack.getViewportLayer(),
                bodyLayerStack.getSelectionLayer());
        
        CompositeLayer compositeLayer = new CompositeLayer(1, 2);
		compositeLayer.setChildLayer(GridRegion.BODY, bodyLayerStack, 0, 1);
		compositeLayer.setChildLayer(GridRegion.COLUMN_HEADER, columnHeaderLayerStack, 0, 0);
        
        final NatTable natTable = new NatTable(parent, compositeLayer, true);
        natTable.configure();

        return natTable;
    }
}
