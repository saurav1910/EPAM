/**
 * 
 */
package com.epam.rd.Facotry;

import com.epam.rd.Biryani.Biryani;

/**
 * @author saura
 *
 */
public interface BaseBiryaniFactory {
	public Biryani createBiryani(String type) throws IllegalArgumentException;
}
