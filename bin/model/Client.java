package model;
import java.util.ArrayList;

public class Client
{
	private String name;
	private int id;
	private int cel;
	private String address;
	private Arraylist<Pet> pets;

	public Client(String name, int id, int cel, String address)
	{
		this.pets = new Arraylist<Pet>();
		this.name = name;
		this.id = id;
		this.cel = cel;
		this.address = address;
	} 
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
	public int getCel()
	{
		return this.cel;
	}
	public String getAddress()
	{
		return this.address;
	}
	public Pet getPet(String name)
	{
		for(int i = 0;i<pets.size();i++)
		{
			if(pets.get(i).getName().equals(name))
			{
				return pets.get(i);
			}
		}
		return null;
	}
}