package com.github.pozo.domain;

public class CompareKey {

	public CompareKey(Module module, Instrument instrument) {
		this.module = module;
		this.instrument = instrument;
	}
	private final Module module;
	private final Instrument instrument;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result
				+ ((module == null) ? 0 : module.hashCode());
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
		CompareKey other = (CompareKey) obj;
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (module == null) {
			if (other.module != null)
				return false;
		} else if (!module.equals(other.module))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CompareKey [module=" + module + ", instrument="
				+ instrument + "]";
	}
	
}