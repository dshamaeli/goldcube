/** Author:Daniel Shamaeli, Student ID:201230464
    this is the first assigment for COMP517
    git@github.com:dshamaeli/goldcube.git
 */

//package declartion

package goldCube;

public class GoldCube
{	
	//class fields
	
	private float size;	//the lenght of one side
	private float price;	//price pere cc

	//Constractor for new objects
	
	public GoldCube(float size, float price)
	{
		this.size = size;
		this.price = price;
	}
	
	//calculate volume by cubing golcube size
	
	public float volume()
	{
		return size*size*size;
	}	

	//calculating value by multiplying the volume by price per cc
	
    	public float value() 
	{
		return volume() * price;
	}	
}
