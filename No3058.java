import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(n == 4 && m == 1) {
            System.out.println("April Fools");
        }else {
            
            System.out.println(n + m);
        
        }
        
    }
}