import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String[] s = new String[8]; 
        int count = 0;
        
        for(int i = 0; i < 8; i++) {
            
            s[i] = sc.nextLine();
            String[] str = s[i].split("",0);
            
            for(int j = 0; j < 8; j++) {
                if(!(str[j].equals("."))) {
                    count++;
                }
            }
            
        }
        if(count % 2 == 0) {
            
            System.out.println(first);
        
            
        }else {
            
            if(first.equals("oda")) {
                System.out.println("yukiko");
            }else {
                System.out.println("oda");
            }
            
        }
        
    }
}