public class SeriesResonantCircuit extends ResonantCircuit{
	public SeriesResonantCircuit(double b, double k, double o){
		super(b,k,o);
		this.r = 1/k;
		this.l = this.r/b;
		this.c = 1/(o*o*this.l);
	}
	public void disp(){
		System.out.println("B = " + b + "\nk = " + k + "\nωo = " + o + "\nR = " + r + "\nL = " + l + "\nC = " + c);
	}
} 