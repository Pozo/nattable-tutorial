package com.github.pozo.domain;
import java.util.ArrayList;
import java.util.List;


public class Module {
	private final String name;
	public String getName() {
		return name;
	}
	public Module(String name) {
		this.name = name;
	}

	private List<Position> positions = new ArrayList<Position>();

	public List<Position> getPositions() {
		return positions;
	}

	public void addPosition(Position position) {
		this.positions.add(position);
	}
	@Override
	public String toString() {
		return "Module [name=" + name + ", positions=" + positions + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}