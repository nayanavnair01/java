package java1;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no of rows");
		int rows = sc.nextInt();
		System.out.println("Enetr the no of col");
		int col =sc.nextInt();
		int [][] matrix1= new int[rows][col];
		int [][] matrix2 = new int[rows][col];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				matrix1[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
			matrix2[i][j]=matrix1[i][j];
		}
		
			
		}System.out.println("the matrix is:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(matrix1[i][j]+"\t");
				
			}
		
		}
		System.out.println("the trans is:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(matrix2[i][j]+"\t");
			}
			}
		}
	}


