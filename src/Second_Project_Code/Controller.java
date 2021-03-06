// Package Declaration //
package Second_Project_Code;

// Java Package Support //
import java.io.IOException;
import java.lang.InterruptedException;
import javax.sound.sampled.LineUnavailableException;

// Internal Package Support //
// { Not Applicable }

/**
 * 
 * Second_Project_Code/Controller.java
 * 
 * @author(s)	: Ian Middleton, Zach Ogle, Matthew J Swann
 * @version  	: 2.0
 * Last Update	: 2013-03-26
 * Update By	: Ian R Middleton
 * 
 * 
 * Second_Project_Code PACKAGE :: Source code for Comp 6360: Wireless & Mobile Networks
 * 	               Assignment 2 :: VOIP
 * 
 * TESTING SCENARIO SCRIPT ONLY.
 * 
 */

public class Controller{
	
	/**
	 * 
	 * TESTING PURPOSES ONLY.
	 * 
	 * @param  args					:
	 * @throws InterruptedException : General InterruptedException for package 
	 * 										functions.
	 * @throws IOException			: General IOException for package functions.
	 * @throws LineUnavailable		: General LineUnavailable for package 
	 * 										functions.
	 */
	public static void main(String[] args) throws InterruptedException,
											IOException, LineUnavailableException{
		
		System.out.println(ConfigReader.getLines("/home/ian/Documents/config.txt"));
		System.out.println(ConfigReader.getLines("/home/ian/Documents/config.txt"));
		
	} // end main()
	
} // end Controller()

