import java.util.Scanner;
import java.lang.Math;
public class ZipCode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("input a zipcode to convert to a barcode or a barcode to convert to a zipcode.");
		if(sc.hasNextInt()){
			System.out.println(ztb(sc.nextInt()));
		}else{
			System.out.println(btz(sc.nextLine()));
		}
	}
	public static int btz(String bar){
		int zip = 0;
		if(bar.length()!=32){
			System.out.println("Invalid Input");
		}else if(!(bar.substring(26,32).equals(":::|||"))){
			System.out.println("Invalid Input");
		}else{
			for(int i = 0 ; i<5; i++){
				int n = 1+i*5;
				double ii = Math.pow(10,(4-i));
				zip += ii*btd(bar.substring(n,n+5));
			}
		}

		return zip;
	}
	public static String ztb(int zip){
		boolean done = false;
		String bar = "Invalid input";
		String sZip = "" + zip;
		while(!done){
			if(zip < 0 || zip > 99999){
				done = true;
			}else{
				bar = "|";
				for(int i = 0; i < sZip.length(); i++){
					bar = bar + dtb(Integer.parseInt(sZip.substring(i,i+1)));
				}
				bar = bar + ":::|||";
				done = true;
			}
		}
		return bar;
	}
	public static int btd(String bar){
		int d = 0;
		if(!(bar.equals("||:::"))){
			if(bar.substring(0,1).equals("|")){
				d+=7;
			}
			if(bar.substring(1,2).equals("|")){
				d+=4;
			}
			if(bar.substring(2,3).equals("|")){
				d+=2;
			}
			if(bar.substring(3,4).equals("|")){
				d+=1;
			}
		}
		return d;
	}
	public static String dtb(int d){
		String bar = ":";
		int d1 = d;
		if(d == 0){
			bar = "||:::";
		}else{
			if(d>= 7){
				bar = "|";
				d -= 7;
			}else{
				bar = ":";
			}
			if(d>= 4){
				bar = bar + "|";
				d-=4;
			}else{
				bar = bar + ":";
			}
			if(d>= 2){
				bar = bar + "|";
				d-=2;
			}else{
				bar = bar + ":";
			}
			if(d>= 1){
				bar = bar + "|";
				d-=1;
			}else{
				bar = bar + ":";
			}
			if(d1 == 1 || d1 == 2 || d1 == 4 || d1 == 7){
				bar = bar + "|";
			}else{
				bar = bar + ":";
			}
		}
		return bar;
	}
}