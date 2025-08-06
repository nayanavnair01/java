package java1;
import java.util.Scanner;
public class greater {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n1 = sc.nextInt();
		System.out.println("enter a number:");
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println(n1 +" is greater");
			
		}
		else {
			System.out.println(n2 + " is grester");
		}
	}
}
