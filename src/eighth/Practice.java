package eighth;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Objects;

public class Practice {

	public static void main(String[] args) {
		
		People p1 = new People("first",LocalDate.of(1994, Month.FEBRUARY, 7));
		People p2 = new People("second",LocalDate.of(1994, Month.FEBRUARY, 7));
		
		System.out.println(p1.getAge());
		System.out.println(p1.compareTo(p2));
		
	}
}

class People implements Comparable<People>{
	
	public String name;
	
	public People(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public LocalDate birthday;
	
	public int getAge() {
		LocalDate today = LocalDate.now(); 
		Period p = Period.between(birthday, today);
		return p.getYears();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(birthday, other.birthday) && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(People o) {
		Period p = Period.between(birthday, o.birthday);
		if (p.isZero()) {
			return 0;
		}else if (p.isNegative()) {
			return -1;
		}else{
			return 1;
		}
	}
}
