package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
	    int redComponent = 110;
	    int greenComponent = 111;
	    int blueComponent = 150;

	    
	    double parameterOne = 0.5;
	    double parameterTwo = 0.5;
	    double parameterThree = 0.3;
	    double parameterFour = 0.2;
	    
	    StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
	    StdDraw.rectangle(parameterOne,parameterTwo, parameterThree, parameterFour);
	 
	    
	    int redComponent2 = 180;
	    int greenComponent2 = 40;
	    int blueComponent2 = 220;
	    
	    double parameterOne2 = 0.5;
	    double parameterTwo2 = 0.5;
	    double parameterThree2 = 0.3;
	    double parameterFour2 = 0.2;
	    
	    StdDraw.setPenColor(redComponent2,greenComponent2,blueComponent2);
	    StdDraw.filledEllipse(parameterOne2, parameterTwo2, parameterThree2, parameterFour2);
	    
	    int redComponent3 = 100;
	    int greenComponent3 = 44;
	    int blueComponent3 = 99;
	    
	    double parameterOne3 = 0.5;
	    double parameterTwo3 = 0.3;
	    double parameterThree3 = 0.7;
	    double parameterFour3= 0.7;
	    double parameterFive = 0.3;
    	double parameterSix = 0.3;
    	
    	
    	double [] X= {parameterOne3, parameterTwo3, parameterThree3};
		double [] Y= {parameterFour3, parameterFive, parameterSix};
	    
	    StdDraw.setPenColor(redComponent3,greenComponent3,blueComponent3);
	    StdDraw.filledPolygon(X,Y);
	 

	}
}