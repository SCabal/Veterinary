package model;
//class
public class Date{
	//atributes
	private int day;
	private int month;
	private int year;
	//constructor
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//methods
	//getters
	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}
	//setters
	public void setDay(int x){
		day=x;
	}

	public void setMonth(int x){
		month=x;
	}

	public void setYear(int x){
		year=x;
	}
}