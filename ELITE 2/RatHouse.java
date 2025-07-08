import java.util.*;
public class RatHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rats: ");
        int r=sc.nextInt();
        System.out.print("Enter Units: ");
        int unit=sc.nextInt();
        System.out.println("Enter The Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int total=r*unit;
        int count=0;
        for(int i=0;i<n;i++)
        {
            count+=arr[i];
            if(count<total)
            {
                count+=arr[i];
                break;
            }
        }
        System.out.println(count);
    }
}
