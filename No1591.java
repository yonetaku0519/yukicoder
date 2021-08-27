import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();
        
        int len = String.valueOf(num).length();
        
        if(len == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");    
        }
        
    }
}
