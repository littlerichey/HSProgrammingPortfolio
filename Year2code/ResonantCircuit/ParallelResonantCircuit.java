public class ParallelResonantCircuit extends ResonantCircuit{
	public ParallelResonantCircuit(double b, double k, double o){
		super(b,k,o);
		this.r = k;
		this.c = 1/(b*this.r);
		this.l = 1/(o*o*this.c);
	}
	public void disp(){
		System.out.println("B = " + b + "\nk = " + k + "\nωo = " + o + "\nR = " + r + "\nL = " + l + "\nC = " + c);
	}
}