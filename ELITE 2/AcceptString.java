import java.util.*;
public class AcceptString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        String s2="";
        for(char ch:s.toCharArray())
        {
            if(!Character.isLetter(ch))
            {
                s2+=ch;
            }
            else
            {
                s1+=ch;
            }
        }
        System.out.println(s2+s1);
    }
}
