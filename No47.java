import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        int count = 0;
        
        while(m < n) {
            m = m * 2;
            count++;
        }
        
        System.out.println(count);
	}
}
