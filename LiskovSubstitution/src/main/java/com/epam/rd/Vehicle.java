/**
 * 
 */
package com.epam.rd;

/**
 * @author saura
 *
 */
public interface Vehicle {
	
	// we have removed engine method from Vehicle because not every vehicle has engine eg.bicycle hence preserving liskov substitution
	public String getName();

	public void setName(String name);

	public void setSpeed(double speed);

	public double getSpeed();

}
