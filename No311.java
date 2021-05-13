import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        
        long count15 = n / 15;
        long count5 = n / 5 - count15;
        long count3 = n / 3 - count15;
        
        long result = 4 * count15 + 2 * count5 + 2 * count3;
        
        System.out.println(result);
	}
}