import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> mp=new HashMap<>();
        String  A="";
        mp.put('a', 0);
        mp.put('e', 0);
        mp.put('i', 0);
        mp.put('o', 0);
        mp.put('u', 0);
        for(char c:s.toCharArray())
        {
           if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
           {
                mp.put(c,mp.getOrDefault(c,0)+1);
           }
           else{
             A+=c;
           }
        }
        System.out.println(mp);
        System.out.println(A);
    }
}
