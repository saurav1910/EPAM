/**
 * 
 */
package com.epam.rd.lowlevel;

import com.epam.rd.highlevel.Switchable;

/**
 * @author saura
 *
 */
public class Bulb implements Switchable {

	public String turnOn() {
		return "Bulb turned on";
		
	}

	public String turnOff() {
		return "Bulb turned off";
	}

}
