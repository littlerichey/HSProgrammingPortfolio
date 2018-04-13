import java.util.Scanner;
public class TriTest{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the x value for your first point.");
		Double x1 = sc.nextDouble();
		System.out.println("Input the y value for your first point.");
		Double y1 = sc.nextDouble();
		System.out.println("Input the x value for your second point.");
		Double x2 = sc.nextDouble();
		System.out.println("Input the y value for your second point.");
		Double y2 = sc.nextDouble();
		System.out.println("Input the x value for your third point.");
		Double x3 = sc.nextDouble();
		System.out.println("Input the y value for your third point.");
		Double y3 = sc.nextDouble();
		Triangle t = new Triangle(x1,y1,x2,y2,x3,y3);
		t.table();
	}
}