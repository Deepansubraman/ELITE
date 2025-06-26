import java.util.*;
public class binaryToggle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n=sc.nextInt();
        String s="";
        while(n!=0)
        {
            int d=n%2;
            if(d==0)
            {
                s='1'+s;
            }
            else{
               s='0' +s;
            }
            n/=2;
        }
        System.out.println("Toggled binary value: "+s);
        int h=0;
        for(int f=0;f<s.length();f++)
        {
            if(s.charAt(f)=='1')
            {
            h=h+(1* (int)(Math.pow(2,s.length()-1-f)));
            }
        }
        System.out.println("toggled value: "+h);

    }
}
