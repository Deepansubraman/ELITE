import java.util.*;

public class seperateNumber {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int d=sc.nextInt();
        int temp=d;
        int c=0;
        while(temp>0)
        {
            int N=temp%10;
            c=c*10+N;
            temp=temp/10;
        }
        while(c>0)
        {
            int n=c%10;
            if(n%2==0)
            {
                a=a*10+n;
            }
            else
            {
                b=b*10+n;
            }
            c=c/10;
        }
        System.out.println("Odd Number: "+b+"\n"+"Even Number: "+a);
    }
}
