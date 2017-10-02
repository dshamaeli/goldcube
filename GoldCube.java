/** Author:Daniel Shamaeli, Student ID:201230464
 *  first assigment for COMP517*/

//package declartion

package goldCube;

public class GoldCube
{	
	//class fields
	
	private float size;	//the lenght of one side
	private float price;	//price pere cc

	//Constractor for new objects
	
	public GoldCube(float s,float p)
	{
		size = s;
		price = p;
	}
	
	//calculate volume by cubing golcube size
	
	public float volume()
	{
		return size*size*size;
	}	

	//calculating value by multiplying the volume by price per cc
	
        public float value() 
	{
		return size * price;
	}	
}
