package model;

public class Room
{
	private boolean status;
	private int roomNum;
	private Pet pet;

	public Room( int roomNum)
	{
		this.status = true;
		this.roomNum = roomNum;
	}

	public boolean getStatus()
	{
		return this.status;
	}
	public int getRoomNum()
	{
		return this.roomNum;
	}
	public void setStatus()
	{
		this.status = status;
	}
	public String addPet(Pet pet)
	{
		if(status == true)
		{
			this.pet = pet;
		 	status = false;
			return "The pet was added succesfuly ";
		}
		else
		{
			return "Theres another pet in that room ";
		}	

	}
	public void dischargePet()
	{
		if(status == false)
		{
			pet = null;
			status = true;
		}
	}
}