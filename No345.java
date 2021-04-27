import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 入力文字列を取得
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// 1文字ずつの配列にする
		String[] s = str.split("",0);
		
		int countC = 0;
		int max = 0;
		
		for(int i = 0; i < s.length; i++) {
		    
		    // cが存在したとき、文字列の何番目に存在したかを保存する
		    if(s[i].equals("c")) {
		        countC = i;
		        
		        // wカウントのリセット
        		int countWW = 0;
		        
		        // cが存在してから、wが存在するかを探索する
		        for(int j = i; j < s.length; j++) {
		            if(s[j].equals("w")) {
		                countWW++;
		                
		                // wが2個存在したとき、cwwの文字列の長さを計算する
		                if(countWW == 2){
		                    countWW = j;
		                    int num = countWW - countC;
		                    
		                    // 計算結果の辻褄合わせ
		                    if(max == 0) {
		                        max = num + 1;
		                    }else if(max > num) {
		                        max = num + 1;
		                    }
		                }
		            }
		        }
		    }
		}
		
		// 出力処理
		if(max == 0) {
		    System.out.println("-1");
		}else{
		    System.out.println(max);
		}
		
		sc.close();
	}
}