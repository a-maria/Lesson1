package Lesson1;

import java.util.Scanner;

public class circle_Chapter3 {

	@SuppressWarnings("resource")
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int diameter = input.nextInt();
		int radius;
		double area;
		double circumference;

		radius = calculateRadius(diameter);
		area = calculateArea(radius);
		circumference = calculateCircumference(diameter);
		
		System.out.println("Radius is:" +radius);
		System.out.println("Area is:" +area);
		System.out.println("Circumference is:" +circumference);

		
		}
	
	public static  int calculateRadius(int diaMeter)
	{
		int radius;
		radius = diaMeter/2;
		return radius;
	}
	
	public static double calculateArea(int radius)
	{
		double area;
		double pi=3.14;
		area = pi*radius*radius;
		return area;
	}
	
	public static double calculateCircumference(int diaMeter)
	{
		double circumference;
		double pi=3.14;
		circumference = pi*diaMeter;
		return circumference;
	}

}
