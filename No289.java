import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 入力情報を受け取る
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	   
	    // 1文字ずつの配列にする
	    String[] s = str.split("",0);
	    int sum = 0;
	    
	    // 標準入力の文字が数字の場合は変換して合計値に足す
	    // 数字に変換できないときはキャッチして、次の文字に判定に移る
	    for(int i = 0; i < s.length; i++) {
	        
	        try{
	            
	            sum += Integer.parseInt(s[i]);
	        
	            
	        }catch(NumberFormatException e) {
	            
	            continue;
	       
	        }
	    }
	    
	    System.out.println(sum);
	    
	}
}