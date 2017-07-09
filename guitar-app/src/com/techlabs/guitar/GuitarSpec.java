package com.techlabs.guitar;

public class GuitarSpec {
	private final Builder builder;
	private final String model;
	private final Type type;
	private final Wood backWood;
	private final Wood topWood;
	private final int stringsNumber;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int stringsNumber) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.stringsNumber = stringsNumber;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getStringsNumber() {
		return stringsNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((backWood == null) ? 0 : backWood.hashCode());
		result = prime * result + ((builder == null) ? 0 : builder.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + stringsNumber;
		result = prime * result + ((topWood == null) ? 0 : topWood.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		GuitarSpec other = (GuitarSpec) obj;
		if (backWood != other.backWood)
			return false;
		if (builder != other.builder)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (stringsNumber != other.stringsNumber)
			return false;
		if (topWood != other.topWood)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return builder + " " + model + " " + type + " " + backWood + " "
				+ topWood + " Strings Number: " + stringsNumber;
	}
}
