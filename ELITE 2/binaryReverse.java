import java.util.*;
public class binaryReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        String s="";
        while(n>0)
        {
            int a=n%2;
            s+=a;
            n=n/2;
        }
        System.out.println("Reversed binary value: "+s);
        int h=0;

        for(int f=0;f<s.length();f++)
        {
            if(s.charAt(f)=='1')
            {
            h=h+(1* (int)(Math.pow(2,s.length()-1-f)));
            }
        }
        System.out.println(h);;
    }
}
