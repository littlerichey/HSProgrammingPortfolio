public class ResonantCircuit{
	protected double b, k, o, r, l, c;
	public ResonantCircuit(double b, double k, double o){
		this.b = b;
		this.k = k;
		this.o = o;
	}
	public void disp(){
		System.out.println("B = " + b + "\nk = " + k + "\n ωo = " + o);
	}
}