package model;

public class Drug
{
//atributos
	private String name;
	private String dose;
	private double costPerDose;
	private String administration;
//builder
	public Drug(String name, String dose, double costPerDose, String administration)
		{
			this.name = name;
			this.dose = dose;
			this.costPerDose = costPerDose;
			this.administration = administration;
		}
//getters	
	public String getName()
		{
			return name;
		}	

	public String getDose()
		{
			return dose;
		}

	public double getCostPerDose()
		{
			return costPerDose;
		}

	public String getAdministration()
		{
			return administration;
		}
//setters
	public void setDose(String dose)
		{
			this.dose = dose;
		}

	public void setAdministation(String administration)
		{
			this.administration = administration;
		}


}