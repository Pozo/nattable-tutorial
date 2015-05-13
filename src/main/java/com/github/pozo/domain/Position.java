package com.github.pozo.domain;


public class Position {
	public Position(Instrument instrument) {
		this.instrument = instrument;
	}
	private Instrument instrument;
	private int initialWeight;
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public int getInitialWeight() {
		return initialWeight;
	}
	public Position setInitialWeight(int initialWeight) {
		this.initialWeight = initialWeight;
		return this;
	}
	@Override
	public String toString() {
		return "Position [instrument=" + instrument + ", initialWeight="
				+ initialWeight + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + initialWeight;
		result = prime * result
				+ ((instrument == null) ? 0 : instrument.hashCode());
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
		Position other = (Position) obj;
		if (initialWeight != other.initialWeight)
			return false;
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		return true;
	}
	
}