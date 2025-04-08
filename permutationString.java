import java.util.*;
class per {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();        
        loop(n, "");                
    }

    public static void loop(String n, String k) {
        if (n.length() == 0) {
            System.out.println(k);
        }
         else {
            for (int i = 0; i < n.length(); i++) {
                String j = k + n.charAt(i);                          
                String l = n.substring(0, i) + n.substring(i + 1);   
                loop(l,j);                                      
            }
        }
    }
}
