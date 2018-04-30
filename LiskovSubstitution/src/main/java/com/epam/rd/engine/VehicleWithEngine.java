package com.epam.rd.engine;

import com.epam.rd.Vehicle;

public abstract class VehicleWithEngine implements Vehicle {
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

	public void startEngine() {
		System.out.print("Engine is started");
	}
}
