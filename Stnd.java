package java1;
class Studnt1{
	String name;
	static int count=0;
	Studnt1(String name){
		this.name = name;
		 count++;
		
	}
	public static int  getStudentDetails() {
		return count;
		
		
	}
}


public class Stnd {
	public static void main(String [] args) {
		Studnt1 s1=new Studnt1("Nayana");
		Studnt1 s2=new Studnt1("vihaan");
		int total= Studnt1.getStudentDetails();
		System.out.println("No of student=" +total);
		
	}

}
