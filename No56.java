import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int s = sc.nextInt();
	    int f = sc.nextInt();
	    
	    int result = s + s * f / 100;
	    
	    System.out.println(result);
	    
	}
}