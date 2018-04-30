package com.epam.rd.noengine;

import com.epam.rd.Vehicle;

public abstract class VehicleWithoutEngine implements Vehicle {
	String name;
	double speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void startMoving() {
		System.out.print("started moving");
	}
}
