/*
 * Kingsley Ulinfun
 * 23/09/2022
 * AP CSA
 * Cmdr Schenk
 * Window.java utillity file
 */
package me.java.turtle;



public class Window {
	
	// Method that pauses the program
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}
	
	//Method that runs the Turtle class
	public  void run() {
	
		    double x0 = 0.5;
            double y0 = 0.0;
            double a0 = 60.0;
	        Turtle myTurtle = new Turtle(x0,y0,a0); //Instantiates object of Turtle class
	        
        //Creating the menu
        int option=myTurtle.Menu();
        if(option == 1) {
            for(double i = 0; true; i+=0.5) {
            	StdDraw.enableDoubleBuffering();
            	StdDraw.setScale(-2,2);
            	x0 = Math.sin(i);
            	y0 = Math.cos(i);
            	myTurtle.setX(x0);
            	myTurtle.setY(y0);
            	myTurtle.clear();
            	myTurtle.filledCircle(0.05);
	            myTurtle.show();
	            myTurtle.pause(20);
	            
            }
        }
        
        else
        	System.exit(0);
        
	}
	
}
