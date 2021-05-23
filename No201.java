import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String[] p1 = sc.nextLine().split(" ",0);
        String[] p2 = sc.nextLine().split(" ",0);
        
        String name1 = p1[0];
        String point1 = p1[1];
        String hand1 = p1[2];
        
        String name2 = p2[0];
        String point2 = p2[1];
        String hand2 = p2[2];
        
        if(point1.length() > point2.length()) {
            System.out.println(name1);
        
        }else if(point2.length() > point1.length()) {
            System.out.println(name2);
        
        }else {
            
            if(point1.compareTo(point2) < 0) {
                System.out.println(name2);
                
            }else if(point1.compareTo(point2) > 0) {
                System.out.println(name1);
            
            }else {
                System.out.println(-1);
            }
            
        }
    }
}