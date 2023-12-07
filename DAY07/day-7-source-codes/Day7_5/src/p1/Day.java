package p1;

enum Day
{
	SUN(10,"SUNDAY"),MON(20,"MONDAY"),TUE(30,"TUESDAY"),WED(40,"WEDNESDAY");
	private int dayNumber;
	private String dayName;
	Day(int dayNumber, String dayName) 
	{
		this.dayName=dayName;
		this.dayNumber=dayNumber;
	}
	
	int getDayNumber()
	{
		return this.dayNumber;
	}
	
	String getDayName()
	{
		return this.dayName;
	}
	
}
