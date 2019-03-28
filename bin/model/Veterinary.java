package model;
import java.util.ArrayList;

public class Veterinary
{
	private double earnings;
	private ArrayList<Room> rooms;
	private ArrayList<Client> clients;
	private ArrayList<MedRec> medRecs;

	public Veterinary()
	{
		initializeRoom();
		this.clients = new ArrayList<Client>();
		this.medRecs = new ArrayList<MedRec>();
	}
	public void initializeRoom()
	{
		for(int i = 0; i<8; i++)
		{
			rooms.add(new Room(i+1))
		}
	}
	public double calculateHospitalization()
	{
		for(int i = 0; i<rooms.size();i++)
		{
			double monay;

		}
	}
	public String calculateMedication(int numRoom)
	{
		double monay = 0;
		ArrayList<Drug> drugs = rooms.get(numRoom - 1).getPet().getMedRec().getDrug();

		for(int i = 0; i<drugs.size();i++)
		{
			monay += drugs.get(i).getCostPerDose();
		}
		return "the cost of the medication is " + monay + "USD";
	}
	public String checkMedRec(int numRoom)
	{
		return rooms.get(numRoom-1).getPet().getMedRec().printMedRec();
	}
	public void dischargePet(int numRoom)
	{
		medRec.add(rooms.get(numRoom - 1).getPet().getMedRec());
		rooms.get(numRoom - 1).dischargePet();
	}
	public void addPet(Pet pet)
	{
		for(int i = 0; i<rooms.size(); i++)
		{
			if(rooms.get(i).getStatus() == true)
			{
				rooms.get(i).addPet(pet);
				break;
			}
		}
	}
	public void addClient(Client client)
	{
		clients.add(client);
	}
}