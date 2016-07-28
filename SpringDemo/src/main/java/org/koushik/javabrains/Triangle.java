/**
 * 
 */
package org.koushik.javabrains;

/**
 * @author Manglu
 *
 */
public class Triangle extends AbstractShape {

	public Triangle(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.koushik.javabrains.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing a triangle... of type:" + getType());

	}

}
