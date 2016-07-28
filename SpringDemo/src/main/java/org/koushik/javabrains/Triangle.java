/**
 * 
 */
package org.koushik.javabrains;

import java.util.List;

/**
 * @author Manglu
 *
 */
public class Triangle { // extends AbstractShape {

	private List<Point> points;

	public void draw() {

		System.out.println("Drawing a traing with point co-ordinates:");
		for (Point aPoint : points) {
			System.out.println(":" + aPoint);
		}

	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

}
