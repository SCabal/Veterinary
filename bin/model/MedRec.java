package model;
import java.util.ArrayList;

public class MedRec
{
// atributes
	private boolean status;
	private Date admissionDate;
	private String diagnose;
	private String symptoms;
	private ArrayList<Drug> drugs; 
    private ArrayList<String> notes;
//builder

 	public MedRec(boolean status, Date admissionDate, String diagnose, String symptoms)
	{
		this.drugs = new Arraylist<Drug>();
		this.status = status;
		this.admissionDate = admissionDate;
		this.diagnose = diagnose;
		this.symptoms = symptoms;
        this.notes = new ArrayList<String>();
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
    /*
     * Description This method allows to add new medicines that were prescription during the hospitalization at the
    patient stories.
    *pre: The patient clinic story must be not null.
    *post: New medicines were added to the patient clinic story.
    *@param The medicine name. This param must be not null.
    *@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time
    according the frequence assigned.
    *@param The medicine cost by each dose. This param could be empty.
    *@param The frequency of medicine application. This param could be empty.
    *@return A message that indiques if medicine was added to the patient clinic story
    */
	public String addDrug(String name, String dose, double costPerDose, String administration )
	{
        Drug temp = new Drug(name, dose, costPerDose, administration);
		drugs.add(temp);
        return temp.getName() + " has been added succesfully <3."
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

    public void addNote(String note)
    {
        notes.add(note);
    }

    public void addSymptom(String symptom)
    {
        this.symptoms += "\n" + symptom + "\n";
    }

}
