package SoftwareEngineering.A1.Testing.P1;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
	
	public boolean isLeap() {
		
		if(this.year%400 == 0) {
			return true;
		}
		else if(this.year%100 == 0) {
			return false;
		}
		else if(this.year % 4 == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Date(int day, int month, int year) throws IllegalArgumentException {
		
		if(day < 0 || month < 0 || year < 0) {
			throw new IllegalArgumentException("All date parameters should be positive");
		}
		
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}
	
}
