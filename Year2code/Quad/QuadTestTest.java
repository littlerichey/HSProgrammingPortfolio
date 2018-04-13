import java.util.Scanner;
public class QuadTestTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an x value for you first point.");
		double x1 = sc.nextDouble();
		System.out.println("Input an y value for you first point.");
		double y1 = sc.nextDouble();
		System.out.println("Input an x value for you second point.");
		double x2 = sc.nextDouble();
		System.out.println("Input an y value for you second point.");
		double y2 = sc.nextDouble();
		System.out.println("Input an x value for you third point.");
		double x3 = sc.nextDouble();
		System.out.println("Input an y value for you third point.");
		double y3 = sc.nextDouble();
		System.out.println("Input an x value for you fourth point.");
		double x4 = sc.nextDouble();
		System.out.println("Input an y value for you fourth point.");
		double y4 = sc.nextDouble();
		QuadTest q = new QuadTest(x1,y1,x2,y2,x3,y3,x4,y4);
		q.getShape();
		System.out.println(q.m1);
		System.out.println(q.m2);
		System.out.println(q.m3);
		System.out.println(q.m4);
	}
}