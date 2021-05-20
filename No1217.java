import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split("",0);
        
        String[] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        String c = "";
        String d = "";
        
        for(int i = 0; i < 26; i++) {
            
            if(!(s[i].equals(a[i]))) {
                c = s[i];
                d = a[i];
            }
        
        }
        
        System.out.println(d + "to" + c);
        
    }
}