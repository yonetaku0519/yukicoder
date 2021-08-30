import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ",0);
        sc.close();
        
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        
        System.out.println((a | b) - (a & b));
        
    }
}
