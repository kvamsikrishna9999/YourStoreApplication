 package com.telus.ninjaapplication.utilities;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestUtilities {
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	public static Logger log=LogManager.getLogger(TestUtilities.class.getName());
	public static Random random = new Random();
	public static int y = random.nextInt(1000);
	public static String emailInput = "Vamsi" + y +"@gmail.com";
}
