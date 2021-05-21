import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        long result = (a * b) % d * c % d;
        // result = a * b;
        // result = result * c;
        // result = result % d;
        
        System.out.println(result);
        
    }
}