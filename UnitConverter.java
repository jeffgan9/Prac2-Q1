/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
/**
 * @(#)Q1.java
 *
 *
 * @author 
 * @version 1.00 2020/6/27
 */

public class Unitconverter {
	
    public static double inchToCentimeter(double in){
    	
    	double cm;
    	
    	System.out.printf("Inches   Centimeters\n");
    	
    	for(int i=0;i<10;i++){
    		cm = in*2.54;
    	        System.out.printf("%.2f \t %.2f\n", in, cm);
    		in++;
		}
		return in;
    }
    
    public static double centimeterToInch(double cm){
    	
    	double inch;
    	
    	System.out.println("Centimeters  Inches");
    	
    	for(int i=0;i<10;i++){
    		inch = cm /2.54;
    		System.out.printf("%.2f \t\t %.2f\n", cm, inch);
    		cm+=5;
    	}
    	return cm;
    }
    
    public static void main(String []args){
      double inchToCentimeter = inchToCentimeter(1.0);
      double centimeterToInch = centimeterToInch(5.0);
    }
}



