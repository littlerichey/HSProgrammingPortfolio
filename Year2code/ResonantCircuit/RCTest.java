import java.util.Scanner;
public class RCTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("do a Parallel Resonant Circuit (y/n)?");
		boolean t = true;
		if(!((sc.nextLine()).equals("y"))){
			System.out.println("then we'll do a Series Resonant Circuit");
			t = false;
		}
		System.out.println("what's the bandwidth?");
		double b = sc.nextDouble();
		System.out.println("what's the Resonant frequency?");
		double o = sc.nextDouble();
		System.out.println("what's the gain");
		double k = sc.nextDouble();
		if(t){
			ParallelResonantCircuit p = new ParallelResonantCircuit (b,k,o);
			p.disp();
		}else{
			SeriesResonantCircuit s = new SeriesResonantCircuit (b,k,o);
			s.disp();	
		}
	}
}