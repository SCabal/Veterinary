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

    /**
    *Description This method allows to update the basic data of a veterinary client, these data include, address and
    phone number.
    *pre: The client was created before.
    *post: The address and /or phone number of the client is updated.
    *@param The new address of the client. This param could be empty.
    *@param The new phone number of the client. This param could be empty.
    */

    /* ehhh... Revisar. ezzzzzzzz xD
        public void updateData(String address, int number)
        {
            if(address != null){
                this.address = address;
                if(number != null) this.cel;
            }else if( number != null ){
                this.cel = number;
                if(address != null) this.address = address;
            }
        }
    */
}
