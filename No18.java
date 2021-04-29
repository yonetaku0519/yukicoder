import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 入力値を取得
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // 入力文字列を1文字ずつの配列にする
        // アルファベットの配列を準備する
        String[] s = str.split("",0);
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] result = new String[s.length];
        
        for(int i = 0; i < s.length; i++) {
            
            for(int j = 0; j < alphabet.length; j++) {
                
                // アルファベットの配列と照合して要素番号を取得する
                if(s[i].equals(alphabet[j])) {
                    int n = j;
                    n = n - i - 1;
                    // System.out.print(j);
                    // System.out.println(" => " + n);
                    
                    // 要素番号をずらしたアルファベットを配列に格納する
                    if(n < 0) {
                        while(n < 0){
                            n = 26 + n;
                        }
                        
                    }
                    result[i] = alphabet[n];
                }
            }
        }
        
        // 出力する
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
	}
}