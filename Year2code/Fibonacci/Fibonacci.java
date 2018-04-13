import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		System.out.println("which fibonacci number would you like to know?");
		int n = sc.nextInt();
		int fp = 0;
		int fn = 1;
		int c = 0;
		for(int i = 1; i <= n; i++){
			c = fn;
			fn += fp;
			fp = fn-fp;
		}
		System.out.println("The "+n+"th fibonacci number is "+c);
	}
}