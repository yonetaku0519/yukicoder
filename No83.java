import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 標準入力を受け取る
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /*ロジックメモ
        ==>> 偶奇で先頭を"1"or"7"を選んで、残りを"1"とすればいい？
        */
        
        if(n % 2 == 1) {
            n = n - 3;
            System.out.print("7");
        }
        
        while(n >= 2) {
            n = n - 2;
            System.out.print("1");
        }
	}
}
