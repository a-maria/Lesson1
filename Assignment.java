package Lesson1;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a float. When finished inputting values, enter an *");
		String str;
		String [] getString = new String[5];
		int arrSize;
		int count=0;
		Double sum = 0.00;
	
		for(int i=0;;i++)
		{
			str = input.nextLine();
			if (str.equals("*"))
			{
				break;
			}

			getString[i]= str;
			count =count +1;
		}
		Double [] getDouble =new Double[count];

		System.out.println("The number of valid entries: "+count);
		
		for(int i=0;i<count;i++)
		{
			getDouble [i] = Double.parseDouble(getString[i]);
			sum = sum + getDouble[i];
		}
			
		
		System.out.println("The Sum of the entries are:"+sum);
		System.out.println("The average of the entries are:" +sum/count);

	}

}
