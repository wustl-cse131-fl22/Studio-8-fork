package studio8;

import java.util.Objects;
import java.util.LinkedList;
import java.util.HashSet;

public class Date {
private int month;
private int day; 
private int year;
private boolean holiday; 

public Date (int month, int day, int year) {
	this.month = month;
	this.day = day ;
	this.year= year ;
	
}

    public static void main(String[] args) {
    	Date date1 = new Date(11, 24, 2022);
    	Date date2 = new Date(12, 25, 2022);
    	Date date3 = new Date(10, 31, 2022);
    	Date date4 = new Date(7, 4, 2022);
    	Date date5 = new Date(7, 4, 2022);
    	
    	LinkedList<Date>list = new LinkedList<>();
    	list.add(date1); 
    	list.add(date2);
    	list.add(date3);
    	list.add(date4);
    	list.add(date5);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(date1);
    	set.add(date2);
    	set.add(date3);
    	set.add(date4);
    	set.add(date5);
    	System.out.println(set);
    	
    }
   
    public String toString() {
        
    	return month + "-" + day + "-" + year;
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}
    

	
}
