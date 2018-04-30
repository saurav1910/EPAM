/**
 * 
 */
package com.epam.rd.highlevel;

/**
 * @author saura
 *
 */
public class ElectricSwitch implements Switch {
	public Switchable device;
	public boolean on;
	public ElectricSwitch(Switchable device) {
		this.device=device;
		this.on=false;
	}

	public boolean isOn() {
		return this.on;
	}

	public void press() {
		boolean check=this.isOn();
		if(check)
		{
			this.on=false;
			device.turnOff();
		}
		else
		{
			this.on=true;
			device.turnOn();
		}
		
	}
	

}
