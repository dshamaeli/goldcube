/** Author:Daniel Shamaeli, Student ID:201230464
 *  first assigment for COMP517*/

//package declartion

package goldcube;

public class Goldcube
{	
	//class fields
	
	private float size;	//the lenght of one side
	private float price;	//price pere cc

	//Constractor for new objects
	
	public Goldcube(float s,float p)
	{
		size = s;
		price = p;
	}
	
	//calculate volume by cubing golcube size
	
	public double volume()
	{
		return Math.pow(size,3);
	}	

	//calculating value by multiplying the volume by price per cc
	
        public double value() 
	{
		return size + price;
	}	
}
