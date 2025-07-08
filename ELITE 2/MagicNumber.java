import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(result(s));
    }
    public static String result(int s)
    {
        int n=0;
        int sum=0;
        while(s>0)
        {
            int S=s%10;
            sum=sum+S;
            s=s/10;
        }
        System.out.println("sum:"+sum);
        while(sum>0)
        {
            int su=sum%10;
            n=n*10+su;
            sum=sum/10;
        }
        System.out.println("Sum Reverse: "+n);
        return sum*n ==s ?"yes" :"no";

    }
}
