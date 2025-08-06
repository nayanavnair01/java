package java1;
class Student{
	String name;
	int rollno;
	int m1,m2,m3;
	float avg;
	
	Student(int rollno, String name, int m1, int m2, int m3){
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}
	public void calculateAverage() {
		avg = (m1+m2+m3)/3;
		System.out.println("Average="+avg);
	}
	public void displayDetails() {
		System.out.println("Roll Number="+ rollno );
		System.out.println("Name="+name);
		System.out.println("Mark1="+ m1);
		System.out.println("Mark2="+ m2);
		System.out.println("Mark3="+ m3);
	    }
	
	}

public class Stddemo {
	public static void main(String [] args) {
		Student student1 = new Student(1 ,"demo1",51,60,40);
		student1.displayDetails();
		student1.calculateAverage();
		Student student2 = new Student(2,"demo2",40,80,71);
		student2.displayDetails();
		student2.calculateAverage();
		
	}
	
}


