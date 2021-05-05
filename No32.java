import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 入力情報を受け取る
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    
	    int sum = 100 * l + 25 * m + n;
	    
	    int result1 = sum / 1000;
	    int after1 = sum % 1000;
	    
	    int result2 = after1 / 100;
	    int after2 = after1 % 100;
	    
	    int result3 = after2 / 25;
	    int after3 = after2 % 25;
	    
	    System.out.println(result2 + result3 + after3);
	    
	}
}