import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String[] str = s.split("",0);
        String[] result = new String[str.length];
        
        for(int i = 0; i < str.length; i++) {
            
            char c = s.charAt(i);
            
            if(Character.isUpperCase(c)) {
                result[i] = str[i].toLowerCase();
            }else {
                result[i] = str[i].toUpperCase();
            }
            System.out.print(result[i]);
        }
	}
}
