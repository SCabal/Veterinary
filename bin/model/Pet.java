package model;

public class Pet
{
//constants
	public static final char DOG = 'D';
	public static final char CAT = 'C';
	public static final char BIRD = 'B';
	public static final char OTHER = 'O';
//atributes
	private String Name;
	private int age;
	private char type;
	private double weight;
	private String breed;
	private MedRec record;
    private double height;
//builder
	public Pet(String name, int age, char type, double weight, String breed, MedRec record, double height)
	{
		this.name = name;
		this.age = age;
		this.type = type;
		this.weight = weight;
		this.breed = breed;
		this.record = record;
        this.height = height;
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
    /**
    *Description This method allows to calculate the body mass index for a pet.
    *pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
    *post: The BMI is calculated.
    *@return The pet body mass index. Returns -1 if the height is zero due to the division on zero does not exist.
    */
    public double calcBMI()
    {
        if(this.height == 0) return -1;
        return (weight/(height*height));
    }

}
