/**
 * 
 */
package com.epam.rd.shapes;

import com.epam.rd.exception.NegativeNotAllowedException;

/**
 * @author Saurabh_Verma
 *
 */
public class Square implements Shape {
	double side;

	public Square(double side) throws NegativeNotAllowedException {
		if (side < 0) {
			throw new NegativeNotAllowedException();
		}
		this.side = side;
	}

	public double findArea() {
		return side * side;
	}

	public double getSide() {
		return side;
	}
}
