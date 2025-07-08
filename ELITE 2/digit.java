import java.util.*;
public class digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=sc.nextInt();
        int count=0;
        int temp=0;
        while(num>0 && num1>0)
        {
            int rem=num%10;
            int rem1=num1%10;
            int sum=rem+rem1+temp;
            if(sum>9)
            {
                count++;
                temp=1;
            }
            else{
                temp=0;
            }
            num=num/10;
            num1=num1/10;
        }
        System.out.println(count);
    }
}
