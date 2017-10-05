/** Author:Daniel Shamaeli, Student ID:201230464
    this is the first assigment for COMP517
    git@github.com:dshamaeli/goldcube.git
 */

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
	    GoldCube[] goldCube = new GoldCube[3];

		//this loop will get the size and price and sets them to the cube
		for(int i=0, j = 1 ; i<3 ; i++, j++)
		{	
			
			//validating user input
			do
			{   
				//prompting user for gold cube price
				System.out.println("Please enter price for cube number " + j + "(per cc):");
				
				//check an see if input is a number
				while(!input.hasNextFloat())  
				{   
					System.out.println("the price should be a positive number");
					input.next();
				}

				//geting use input
				price = input.nextFloat();
				
			}while(price <=0); 
			
			System.out.println("Please enter Size cube number "+ j + "(cm):");
			//validating user input	
			size = input.nextFloat();
		
			goldCube[i] = new GoldCube(size,price);

			//implement user prompt to continue
		}
		System.out.println("The Result is");

		for(int i = 0 ,j = 1 ; i<3 ; i++, j++)
		{
			System.out.println("GoldCube No." + j + " Volume: " + goldCube[i].volume()
			 + " Price: " + goldCube[i].value());
		}
	}
}
