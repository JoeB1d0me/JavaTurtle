/*
 * Kingsley Ulinfun
 * 21/09/2022
 * AP CSA
 * Cmdr Schenk
 * Python Turtle graphics in Java
 * 
 * Utilizes the StdDraw from https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
 */
package me.java.turtle;

import java.util.Scanner;

import java.awt.Color;


public class Turtle {
	private double x,y; //The default positions of the turtle
	private double angle;
	private Scanner myScan = new Scanner(System.in);
	
	// Constructors
	
	// default
	
	public Turtle() {
		x = 0.0;
		y = 0.0;
		angle = 0.0;
		
	}
	
	// partial
	
	public Turtle(double x0, double y0) {
		x = x0;
		y = y0;
		angle = 0;
	}
	
	// full
	public Turtle(double x0, double y0, double angle0) {
		x = x0;
		y = y0;
		angle = angle0;
	}
	
	// Getters and Setters
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	
	// Display Method
	public void showTurtleStats(){
		System.out.println("Turtle Status");
		System.out.println("X position: "+this.getX());
		System.out.println("Y position: "+this.getY());
		System.out.println("Current Angle: "+this.getAngle());
		
	}
	
	// Additional Methods
	
	public void setColor(Color color) {
		StdDraw.setPenColor(color);
	}
	public void setWindowSize(int width, int height) {
		StdDraw.setCanvasSize(width,height);
	}
	public void setPenSize(int size) {
		StdDraw.setPenRadius(size);
	}
	
	public void leftTurn(double delta) { //rotates the cursor by delta degrees
		angle += delta;
	}
	
	public void rightTurn(double delta) {
		angle -= delta;
	}
	
	// Moves forward from the old point to the new point by steps
	public void Forward(double steps) {
		double oldx = x;
		double oldy = y;
		x += steps * Math.cos(Math.toRadians(angle));
		y += steps * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
	}
	
	// creates a filled circle
	public void filledCircle(double rad) {
		double x = this.getX();
		double y = this.getY();
		StdDraw.filledCircle(x, y, rad);
	}
	
	
	// Creating an animated filled circle
	
	public void animatedFilledCircle(int animations,double rad) {
		double x = this.getX();
	}
	
	// clears the screen
	public void clear() {
		StdDraw.clear();
	}
	
	public void show() { // shows the drawing
		StdDraw.show();
	}
	public void pause(int t) {
		StdDraw.pause(t);
	}
	
	
	public int Menu() {

		String choice = "";
		int x = 0;
		do {
			System.out.println("Would you like to start?\n"+
					"1. Yes\n"+
					"2. No");
			try{
				choice = myScan.nextLine();
				x= Integer.parseInt(choice);
				switch (x) {
					case 1:
						System.out.println("Starting");
						return 1;

						
					case 2:
						System.out.println("Ending.");
						return 2;
					default:
						System.out.println("Invalid input");
						break;
				}
			}catch(Exception e) {
				System.out.println("ERROR: Enter an integer");
				
				
			}
			
		} while (true);
	}

}
