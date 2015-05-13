package com.github.pozo.nattable;

import java.util.List;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;

import com.github.pozo.domain.Module;

final class BodyDataProvider implements IDataProvider {
	private final List<Module> modules;

	BodyDataProvider(List<Module> modules) {
		this.modules = modules;
	}

	public void setDataValue(int arg0, int arg1, Object arg2) {
		throw new UnsupportedOperationException();
		
	}

	public int getRowCount() {
		return 4;
	}

	public Object getDataValue(int arg0, int arg1) {
		return modules.get(arg0).getPositions().get(arg1).getInitialWeight();
	}

	public int getColumnCount() {
		return modules.size();
	}
}