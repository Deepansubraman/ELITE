import java.util.*;
public class Stringequals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mp.put(ch,mp.getOrDefault(ch,0 )+1);
        }
        if(mp.get('#') == mp.get('*'))
        {
            System.out.println(0);
        }
        else 
        {
            System.out.println(Math.abs(mp.get('#')-mp.get('*')));
        }
        
    }
}
