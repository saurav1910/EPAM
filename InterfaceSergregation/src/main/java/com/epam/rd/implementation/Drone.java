/**
 * 
 */
package com.epam.rd.implementation;

import com.epam.rd.ICamera;
import com.epam.rd.Vehicle;

/**
 * @author saurabh
 *
 */
public class Drone implements Vehicle,ICamera {

	public String focus() {
		return "focused on target"; 	
	}

	public String start() {
		return "Drone started";
	}

	public String accelerate() {
		return "Drone speed increased";
	}

	public String stop() {
		return "Drone stopped";
	}

}
