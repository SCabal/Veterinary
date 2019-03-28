package model;


public class Pet
{
//constants
	public static final char DOG = 'D';
	public static final char CAT = 'C';
	public static final char BIRD = 'B';
	public static final char OTHER = 'O';
//variables
	private String Name;
	private int age;
	private char type;
	private double weight;
	private String breed;
	private MedRec record;
//builder
	public Pet(String name, int age, char type, double weight, String breed, MedRec record)
	{
		this.name = name;
		this.age = age;
		this.type = type;
		this.weight = weight;
		this.breed = breed;
		this.record = record;
	}	
//getters
	public String getName()
	{
		return this.name;
	}	
	public int getAge()
	{
		return this.age;
	}
	public char getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public String getBreed()
	{
		return this.breed;
	}
	public String getRecord()
	{
		return record.printMedRec();
	}

}