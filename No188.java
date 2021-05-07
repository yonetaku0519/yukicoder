import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    // 2015年の各月がとりうる日付の数
	    int[] days = {31,28,31,30,31,30,31,30,31,31,30,31};
	    int count = 0;
	    int result = 0;
	    
	    for(int i = 1; i <= 12; i++) {
	        
	        for(int j = 1; j <= days[i - 1]; j++) {
	            
	            result = j / 10 + j % 10;
	            
	            if(result == i) {
	                count++;
	            }
	            
	        }
	        
	    }
	    
	    System.out.println(count);
	    
	}
}