/**
 * 
 */
package com.epam.rd.implementation;

import com.epam.rd.IMusic;
import com.epam.rd.Vehicle;

/**
 * @author saurabh
 *
 */
public class Car implements IMusic, Vehicle {

	public String start() {
		return "Car started";

	}

	
	public String accelerate() {
		return "speed increased";

	}


	public String stop() {
		return "Car stopped";

	}

	public String play() {
		return "playing the music";
	}

}
