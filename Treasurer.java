/** Author:Daniel Shamaeli, Student ID:201230464
 *  *  first assigment for COMP517*/

//impoert package to read data

import goldCube.GoldCube;

import java.util.Scanner;

public class Treasurer
{	
	
	private static float size;
	private static float price;
	//main methods */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	    	GoldCube[] cube = new GoldCube[3];
	//	int i=1;
		for(int i=0, j = 1 ; i<3 ; i++, j++)
		{
			System.out.println("Please enter Size for cube number "+ j + ":");
			size = input.nextFloat();
					
			System.out.println("Please enter price for cube number " + j + ":");
			price = input.nextFloat();

			cube[i] = new GoldCube(size,price);

			//implement user prompt to continue
		}
		System.out.println("The Result is");

		for(int i = 0 ,j = 1 ; i<3 ; i++, j++)
		{
			System.out.println("GoldCube No." + j + " Volume: " + cube[i].volume() +
					" Price: " + cube[i].value());
		}
	}	
}
