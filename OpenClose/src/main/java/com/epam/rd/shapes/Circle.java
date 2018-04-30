/**
 * 
 */
package com.epam.rd.shapes;

import com.epam.rd.exception.NegativeNotAllowedException;

/**
 * @author Saurabh_Verma
 *
 */
public class Circle implements Shape {
	double radius;

	public Circle(double radius) throws NegativeNotAllowedException {
		if(radius<0)
		{
			throw new NegativeNotAllowedException();
		}
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
