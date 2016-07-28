package org.koushik.javabrains;

public abstract class AbstractShape implements Shape {

	protected String type = "default";
	
	
	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void setType(String type) {
		this.type = type;

	}

}
