package demos;

import processing.core.PApplet;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyDisplay extends PApplet {

	public void setup()
	{
		size(400, 400);
		background(200, 200, 200);
		
	}
	
	public void draw()
	{
		//fill(255, 255, 0);
		//ellipse(200, 200, 390, 390);
		//fill(0, 0, 0);
		//ellipse(120, 130, 50, 70);
		//ellipse(280, 130, 50, 70);
		
		//noFill();
		//arc(200, 280, 75, 75, 0, PI);
		fill(255,255,255);
		rect(100, 200, 150, 200);
		fill(0,0,0);
		textSize(15);
		text("Earthquake Key", 120, 220);
		fill(255,0,0);
		ellipse(120,250,15,15);
		textSize(12);
		fill(0,0,0);
		text("5.0+ Magnitude", 150, 255);
		fill(0,0,255);
		ellipse(120,300,10,10);
		fill(0,0,0);
		text("4.0+ Magnitude", 150, 305);
		fill(255,255,0);
		ellipse(120,350,8,8);
		fill(0,0,0);
		text("Below 4.0", 150, 355);
		
		
		
	}
	
}
