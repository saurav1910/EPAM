package com.epam.rd.shapes;

import com.epam.rd.exception.NegativeNotAllowedException;

public class Triangle implements Shape {
	double length;
	double height;

	public Triangle(double length, double height) throws NegativeNotAllowedException {
		if (length < 0 && height < 0) {
			throw new NegativeNotAllowedException();
		}

		this.length = length;
		this.height = height;
	}

	public double findArea() {
		return (length * height) / 2;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}
}
