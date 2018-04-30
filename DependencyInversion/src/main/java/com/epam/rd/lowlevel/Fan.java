/**
 * 
 */
package com.epam.rd.lowlevel;

import com.epam.rd.highlevel.Switchable;

/**
 * @author saura
 *
 */
public class Fan implements Switchable {

	public String turnOn() {
		return "fan turned on";
	}

	public String turnOff() {
		return "fan turned off";
	}

}
