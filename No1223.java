import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long k = sc.nextLong();
        Long t = sc.nextLong();
        
        Long distance = k * t;
        
        if(n < 0) {
            n = -n;
        }
        
        if(distance < n) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
        
    }
}