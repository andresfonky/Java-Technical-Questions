package inmutable;

public class Age {
	
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	
	public Age clone() {
		Age a = new Age();
		a.setYear(this.year);
		a.setMonth(this.month);
		a.setDay(this.day);
		return a;
		
	}

	public void setYear(int year) {
		this.year = year;
	}
}
