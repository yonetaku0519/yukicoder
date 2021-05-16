import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 期待値はサイコロの数を3.5倍すればいい
        System.out.println(3.5 * n);
	}
}