import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        
        // 一度に齧る二人分のポッキーの距離
        int b = k * 2;
        
        // 齧る回数と残る距離
        int n = l / b;
        int m = l % b;
        
        // 辻褄合わせ
        if(m == 0) {
            n--;
        }
        
        System.out.println(n * k);
        
	}
}