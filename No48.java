import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        long x = Integer.parseInt(sc.nextLine());
        long y = Integer.parseInt(sc.nextLine());
        long l = Integer.parseInt(sc.nextLine());
        
        long count = 0;
        long dis = 0;
        // 向きの変更回数
        
        if(y >= 0 && x != 0 ) {
            count++;
        }else if(y < 0) {
            count += 2;
        }
        
         if(y < 0) {
            y = -y;
        }
        
        if(y % l != 0) {
            dis = y / l + 1;
            count += dis;
        }else {
            dis = y / l;
            count += dis;
            
        }
        
        if(x < 0) {
            x = -x;
        }
        
        if(x % l != 0) {
            dis = x / l + 1;
           count += dis;
        }else {
            dis = x / l;
            count += dis;
        }
        
        System.out.println(count);
    }
}
