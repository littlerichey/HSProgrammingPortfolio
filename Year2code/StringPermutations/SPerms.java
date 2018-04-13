import java.util.Scanner;
import java.util.Stack;
public class SPerms{
	public static void main(String[] args){
		Stack<String> s = new Stack<>();
		Stack<String> p = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String to have permutated.");
		String n = sc.nextLine();
		s.push(("+" + n));
		while(s.size() > 0){
			String t = s.pop();
			if(t.substring((t.length()-1),t.length()).equals("+")){
				p.push(t.substring(0,(t.length()-1)));
			}else{
				int i = 0;
				boolean g = true;
				while(g){
					if(t.substring(i,i+1).equals("+")){
						g = false;
					}else{
						i++;
					}
				}
				for(int j = i+1; j < t.length(); j++){
					s.push(t.substring(0,i)+t.substring(j,j+1)+t.substring(i,j)+t.substring(j+1,t.length()));
				}
			}
		}
		int c = 0;
		while(p.size() > 0){
			System.out.print(p.pop());
			c++;
			System.out.print(", ");

		}
		System.out.println(c);
	}
}