package java1;
import  java.util.Scanner;
public class mark {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark:");
		int m1 = sc.nextInt();
		if(m1>=90) {
			System.out.println("GradeA ");
			}
		else if(m1>=75) {
			System.out.println("Grade B");
		}
		else if(m1>=60) {
			System.out.println("Grade C");	
		}
		else if(m1>=40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("fail");
		}
	}
	

}
