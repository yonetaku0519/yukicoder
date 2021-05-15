import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int d = sc.nextInt();
        
        
        // 最終日の残り作業量を把握したい
        for(int i = d; i > 1; i--) {
            
            w = w - w/i/i;
            
        }
        
        System.out.println(w);
        
	}
}
