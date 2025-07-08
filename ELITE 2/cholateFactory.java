import java.util.*;
public class cholateFactory {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<a)
        {
            arr[count]=0;
            count++;
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
