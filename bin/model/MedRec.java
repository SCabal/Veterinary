package model;
import java.util.ArrayList;

public class MedRec
{
	private boolean status;
	private Date admissionDate;
	private String diagnose;
	private String symptoms;
	private Arraylist<Drug> drugs; 
//builder

 	public MedRec(boolean status, Date admissionDate, String diagnose, String symptoms)
	{
		this.drugs = new Arraylist<Drug>();
		this.status = status;
		this.admissionDate = admissionDate;
		this.diagnose = diagnose;
		this.symptoms = symptoms;
	}
//getters
	public boolean getStatus()
	{
		return this.status;
	}

	public Date getAdmissionDate()
	{
		return this.admissionDate;
	}

	public String getDiagnose()
	{
		return this.diagnose;
	}
	public String getSymptoms()
	{
		return this.symptoms;
	}
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	public void addDrug(Drug meth)
	{
		drugs.add(meth);
	}

	public String printMedRec()
	{
		String mediRec = "";
		if(status == true)
		{
			mediRec = "Medical Record is OPEN. \n";
		}
		else
		{
			mediRec = "Medical Record is CLOSED. \n";
		}


		mediRec += "Admission Date: "+ this.admissionDate.getDay()+ "/" +this.admissionDate.getMonth()+ "/" + this.admissionDate.getYear()+ "\n";

		mediRec += "Diagnose: "+ this.diagnose;
		
		mediRec += "Symptoms: " + this.symptoms;

		mediRec += "Drugs: \n";
		for (int i= 0; i < drugs.size();i++)
		{
			mediRec += "Name: "+drugs.get(i).getName() +"\n"+ "Dose: "+drugs.get(i).getDose() +"\n"+ "Administration: "+drugs.get(i).getAdministration();
		}
		return mediRec;
	}

}