import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    // 整数Aを配列に格納する
	    int[] number = new int[n];
	    for(int i = 0; i < n; i++) {
	        number[i] = sc.nextInt();
	    }
	    
	    // 小さい順にソートする
	    Arrays.sort(number);
	    double result = 0;
	    
	    // 整数Aが偶数個の時
	    if(n % 2 == 0) {
	        int central = n / 2;
	        result = ((double)number[central - 1] + (double)number[central]) / 2;
	    }else {
	        int central = n / 2;
	        result = (double)number[central + 1];
	    }
	    
	    System.out.println(result);
	}
}