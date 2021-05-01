import java.util.*;

public class Main {
	public static void main(String[] args) {
	  
	  // 入力データを受け取る
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	  // 勝敗判定
	  if(a == b) {
	      System.out.println("Drew");
	  }else if(a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0) {
	      System.out.println("Won");
	  }else {
	      System.out.println("Lost");
	  }
	}
}