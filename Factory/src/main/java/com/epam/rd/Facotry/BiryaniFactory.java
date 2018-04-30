/**
 * 
 */
package com.epam.rd.Facotry;

import com.epam.rd.Biryani.Biryani;
import com.epam.rd.Biryani.ChickenBiryani;
import com.epam.rd.Biryani.EggBiryani;
import com.epam.rd.Biryani.VegBiryani;

/**
 * @author saura
 *
 */
public class BiryaniFactory implements BaseBiryaniFactory {

	public Biryani createBiryani(String type) throws IllegalArgumentException  {
		Biryani biryani;
		switch (type.toUpperCase()) {
		case "CHICKEN":
			biryani=new ChickenBiryani();
			break;
		case "EGG":
			biryani=new EggBiryani();
			break;
		case "VEG":
			biryani =new VegBiryani();
			break;
		default:
			throw new IllegalArgumentException("No such biryani found");
		}
		biryani.addIngredients();
		biryani.makeBiryani();
		return biryani;
	}
	

}
