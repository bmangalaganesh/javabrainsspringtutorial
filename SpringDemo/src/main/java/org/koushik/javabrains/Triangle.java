/**
 * 
 */
package org.koushik.javabrains;

/**
 * @author Manglu
 *
 */
public class Triangle { // extends AbstractShape {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public void draw() {
		System.out.println("Drawing a triangle... with points A:" + getPointA() + "  point B:" + getPointB()
				+ " point C:" + getPointC());

	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

}
