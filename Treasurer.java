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
	
	public static float validFloat(String tag,int counter)
	{
		float var;
		Scanner input = new Scanner(System.in);

		do
		{   
			//prompting user for gold cube price
			System.out.println("Please enter "+ tag +" for cube No." + counter + " :");
				
			//check an see if input is a number
			while(!input.hasNextFloat())  
			{   
				System.out.println("The gold-cube " + tag +" should be a positive number");
				input.next();
			}

			//geting use input
			var = input.nextFloat();
				
		//check if input is positive	
		}while(var <=0);  

		return var;
	}

	//main methods */
	public static void main(String[] args)
	{
		//container for goldCubes
		GoldCube[] goldCube = new GoldCube[3];

		//container for price of goldCubes
		float price;

		//container for size of goldCubes
		float size;

		//this loop will get the size and price and sets them to the goldCubes
		for(int i=0, j = 1 ; i<3 ; i++, j++)
		{	
			//get a goldCube price
			price = validFloat("price",j);
			
			//get a goldCube size
			size = validFloat("size",j);

			//Ceate a goldCube with given price and size
			goldCube[i] = new GoldCube(size,price);

			//print result for user
		}

		for(int i = 0 ,j = 1 ; i<3 ; i++, j++)
		{
			System.out.println("**************************");
			System.out.println("GoldCube No." + j + "\nVolume: " + goldCube[i].volume() +" cc"
			 + "\nPrice: " + goldCube[i].value()+" £\n");
					}
	}
}
