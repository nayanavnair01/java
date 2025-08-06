package java1;
class Shape{
	public int area(int a) {
		System.out.println("Square");
		return a*a;
	}
	public int area(int l,int b){
		System.out.println("Rectangle");
		return l*b;
		
	}
	public double area(float r) {

		System.out.println("Circle");
		return (3.14*(r*r));
		
		}
}
public class MethodovrLoading {
	public static void main(String [] args) {
		Shape shape=new Shape();
		int rectarea = shape.area(5,7);
		System.out.println("Area of Rectangle is "+rectarea);
		double cirarea = shape.area(5.8f);
		System.out.println("Area of circle is "+cirarea);
		int sqarea = shape.area(5);
		System.out.println("Area of Rectangle is "+sqarea);
	}

}
