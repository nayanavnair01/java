package java1;
import java.util.Scanner;
public class evenorodd {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		System.out.println("the number:" +num);
		if(num%2==0) {
			System.out.println(num + " is even ");
		}
		else {
			System.out.println( num + " is odd");
		}
		
	}

}
