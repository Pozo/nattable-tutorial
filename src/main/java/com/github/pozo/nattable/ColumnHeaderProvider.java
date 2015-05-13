package com.github.pozo.nattable;

import java.util.List;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;

import com.github.pozo.domain.Module;

final class ColumnHeaderProvider implements IDataProvider {
	private final List<Module> modules;

	ColumnHeaderProvider(List<Module> modules) {
		this.modules = modules;
	}

	public void setDataValue(int arg0, int arg1, Object arg2) {
		throw new UnsupportedOperationException();
		
	}

	public int getRowCount() {
		return 1;
	}

	public Object getDataValue(int arg0, int arg1) {
		return modules.get(arg0).getName();
	}

	public int getColumnCount() {
		return modules.size();
	}
}