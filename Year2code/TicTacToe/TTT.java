import java.util.Random;
import java.util.Scanner;
public class TTT{
	private String[][] ttt = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
	private boolean xw = false;
	private boolean ow = false;
	private boolean xm = true;
	public TTT(){
	}
	public void move(String i){
		Scanner sc = new Scanner(System.in);
		boolean m = true;
		while(m){
			System.out.println("what horizontal do you want? ");
			int x = sc.nextInt();
			System.out.println("what vertical do you want? ");
			int y = sc.nextInt();
			if(x < 1 || x > 3){
				System.out.println("invalid horizontal");
			}else if(y < 1 || y > 3){
				System.out.println("invalid vertical");
			}else if(!(ttt[y-1][x-1].equals("_"))) {
				System.out.println("space taken");
			}else{
				ttt[y-1][x-1] = i;
				System.out.println(ttt[0][0] + ttt[0][1] + ttt[0][2] + "\n" + ttt[1][0] + ttt[1][1] + ttt[1][2] + "\n" + ttt[2][0] + ttt[2][1] + ttt[2][2]);
				
				m = false;
			}
		}
	}
	public void play(){
		while(!(xw || ow)){
			int c = 0;
			if(xm){
				move("x");
				xm = false;
			}else{
				move("o");
				xm = true;
			}
			for(int i = 0; i < 3; i++){
				if((ttt[i][0].equals("x") && ttt[i][1].equals("x") && ttt[i][2].equals("x")) || (ttt[0][i].equals("x") && ttt[1][i].equals("x") && ttt[2][i].equals("x")) || (ttt[0][0].equals("x") && ttt[1][1].equals("x") && ttt[2][2].equals("x")) || (ttt[0][2].equals("x") && ttt[1][1].equals("x") && ttt[2][0].equals("x")) ){
					xw = true;
					System.out.println("X wins");
				}
				if((ttt[i][0].equals("o") && ttt[i][1].equals("o") && ttt[i][2].equals("o")) || (ttt[0][i].equals("o") && ttt[1][i].equals("o") && ttt[2][i].equals("o")) || (ttt[0][0].equals("o") && ttt[1][1].equals("o") && ttt[2][2].equals("o")) || (ttt[0][2].equals("o") && ttt[1][1].equals("o") && ttt[2][0].equals("o")) ){
					ow = true;
					System.out.println("o wins");
				}
				for(int ii = 0; ii < 3; ii++){
					if(!(ttt[i][ii].equals("_"))){
						c++;
					}
					if(c == 9){
						xw = true;
						ow = true;
						System.out.println("tie");
					}
				}
			}
		}
		
	}
}
