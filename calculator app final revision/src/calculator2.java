//Jarrett Nobles 
//due 9/27/2020

import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class calculator2 {
	//Calculate the area of a sphere
	public static double sphereArea(double radius)
	{
		double Area= 4 * Math.PI * Math.pow(radius, 2);
		return Area;
	}
	//Calculate the volume of a sphere
	public static double volume(double radius)
	{
		double v = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
		return v;
	}
	//calculate the area of a circle
	public static double area(double radius)
	{
		double circArea = Math.PI * Math.pow(radius, 2);
		return circArea;
	}
	//calculate the circumference of a circle
	public static double circumference(double radius)
	{
		double circ = 2 * Math.PI *radius;
		return circ; 

	}
	
	public static void main(String[] args) {
		//Statements to get the radius using user input and printing the results
				double radius;
				Scanner input=new Scanner(System.in);
				System.out.println("Enter the radius (cm): ");
				radius=input.nextDouble();
				System.out.println("Radius = "+ radius+" cm");
				DecimalFormat ft = new DecimalFormat("#.###");
				System.out.println("The area of a Sphere with a radius of "+ radius + "cm = "+ ft.format(sphereArea(radius)));
				
				System.out.println("The volume of a Sphere with a radius of "+ radius +"cm = "+ft.format(volume(radius)));
				
				System.out.println("The area of a circle with a radius of "+ radius +"cm = "+ft.format(area(radius)));
				
				System.out.println("The circumference of a circle with a radius of "+radius+"cm = "+ft.format(circumference(radius)));
				

	}
	
	
}
