package com.crm.vtiger.GenericUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * @ GAURAV
	 * this method is used to generate random number to avoid duplicates
	 * @return
	 */
public static String getRandomData() {
	Random random = new Random();
	int randomdata = random.nextInt(1000);
	return ""+randomdata;
	
}
/**
 * @ GAURAV
 * this method is used to generate currentdate
 * @return
 */
public static String getCurrentDate() {
	Date date = new Date();
	String currentdate = date.toString();
	return currentdate;
}

}
