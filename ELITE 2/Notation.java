import java.util.*;
public class Notation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n: ");
        int n=sc.nextInt();
        System.out.print("Num: ");
        int num=sc.nextInt();
        String s="";
        StringBuffer sb=new StringBuffer(s);
        while(num>0)
        {
            int rem=num%n;
            if(rem<10)
            {
                sb.append(rem);
                
            }
            else{
                char ch=(char)(rem-10+65);
                sb.append(ch);
            }
            num=num/n;
        }
        System.out.println(sb.reverse().toString());
    }
}
