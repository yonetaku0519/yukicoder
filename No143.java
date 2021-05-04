import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 入力情報を受け取る
	    Scanner sc = new Scanner(System.in);
	    int k = sc.nextInt();
	    int n = sc.nextInt();
	    int f = sc.nextInt();
	    
	    int sum = 0;
	    
	    // 必要な豆の総数
	    for(int i = 0; i < f; i++) {
	        sum += sc.nextInt();
	    }
	    
	    // 準備した豆の合計数
	    int num = k * n;
	    
	    // イコールを追記
	    if(num >= sum) {
	        System.out.println(num - sum);
	    }else{
	        System.out.println("-1");
	    }
	    
	}
}