import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 入力値を取得
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = sc.nextInt();
		
		// ブロックは配列に格納する
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
		    numbers[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		
		// 配列の要素をソートする
		Arrays.sort(numbers);
		int value = 0;
		int count = 0;
		
		// ブロックを小さい順に足し算し、箱に入るブロック数を探索する
		for(int i = 0; i < n; i++) {
		    value += numbers[i];
		    if(value <= l) {
		        count++;
		    }
		}
		
		// 出力
		System.out.println(count);
	    
	}
}
