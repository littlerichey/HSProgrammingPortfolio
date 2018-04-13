import java.lang.Math;
public class Triangle{
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	private double s1;
	private double s2;
	private double s3;
	private double a1;
	private double a2;
	private double a3;
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.getSides();
		this.getAngs();
	}
	public void getSides(){
		this.s1 = Math.sqrt(Math.pow((this.x1-this.x2),2)+Math.pow((this.y1-this.y2),2));
		this.s2 = Math.sqrt(Math.pow((this.x1-this.x3),2)+Math.pow((this.y1-this.y3),2));
		this.s3 = Math.sqrt(Math.pow((this.x3-this.x2),2)+Math.pow((this.y3-this.y2),2));
	} 
	public double getPer(){
		double p = this.s1 + this.s1 + this.s3;
		return p;
	}
	public void getAngs(){
		this.a1 = Math.acos((Math.pow(this.s3,2)+Math.pow(this.s2,2)-Math.pow(this.s1,2))/(2*this.s3*this.s2));
		this.a2 = Math.acos((Math.pow(this.s1,2)+Math.pow(this.s3,2)-Math.pow(this.s2,2))/(2*this.s1*this.s3));
		this.a3 = Math.acos((Math.pow(this.s2,2)+Math.pow(this.s1,2)-Math.pow(this.s3,2))/(2*this.s2*this.s1));
	}
	public double getArea(){
		double a = (this.s1*this.s2*Math.sin(this.a3))/2;
		return a;
	}
	public void table(){
		System.out.println("Side 1 (from point 1 to point 2):" + s1);
		System.out.println("Side 2 (from point 1 to point 3):" + s2);
		System.out.println("Side 3 (from point 3 to point 2):" + s3);
		System.out.println("Angle 1 (Oppisite side 1):" + a1);
		System.out.println("Angle 2 (Oppisite side 2):" + a2);
		System.out.println("Angle 3 (Oppisite side 3):" + a3);
		System.out.println("Perimeter:" + this.getPer());
		System.out.println("Area:" + this.getArea());
	}

}