import java.lang.Math;
public class QuadTest{
	public double x1,x2,x3,x4,y1,y2,y3,y4,s1,s2,s3,s4,m1,m2,m3,m4;
	public QuadTest(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		this.s1 = this.getSide(x1,y1,x2,y2);
		this.m1 = this.getSlope(x1,y1,x2,y2);
		this.s2 = this.getSide(x3,y3,x2,y2);
		this.m2 = this.getSlope(x3,y3,x2,y2);
		this.s3 = this.getSide(x3,y3,x4,y4);
		this.m3 = this.getSlope(x3,y3,x4,y4);
		this.s4 = this.getSide(x1,y1,x4,y4);
		this.m4 = this.getSlope(x1,y1,x4,y4);
	}
	public double getSide(double x1,double y1,double x2,double y2){
		double s = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		return s;
	}
	public double getSlope(double x1,double y1,double x2,double y2){
		double m = (y2-y1)/(x2-x1);
		return m;
	}
	public boolean isRect(double m1,double m2,double m3,double m4){
		boolean b = false;
		if(m1 == m3 && m2 == m4 && m1 == 1/m2*(-1)){
			b = true;
		}else{
 			b = false;
		}
		return b;
	}
	public boolean isRhomb(double s1,double s2,double s3,double s4){
		if(s1 == s2 && s1 == s3 && s1 == s4){
			return true;
		}else{
			return false;
		}
	}
	public boolean isTrap(double m1,double m2,double m3,double m4){
		if(m1 == m3 || m2 == m4){
			return true;
		}else{
			return false;
		}
	}
	public void getShape(){
		boolean a = false;
		if(this.isRect(this.m1,this.m2,this.m3,this.m4) && this.isRhomb(this.s1,this.s2,this.s3,this.s4)){
			System.out.println("This shape is a square.");
			a = true;
		}
		if(this.isRect(this.m1,this.m2,this.m3,this.m4)){
			System.out.println("This shape is a rectangle.");
			a = true;
		}
		if(this.isRhomb(this.s1,this.s2,this.s3,this.s4)){
			System.out.println("This shape is a rhombus.");
			a = true;
		}
		if(this.isTrap(this.m1,this.m2,this.m3,this.m4)){
			System.out.println("This shape is a trapezoid.");
			a = true;
		}
		if(!a){
			System.out.println("This shape is an irregular quadrilateral.");
		}
	}
}