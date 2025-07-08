import java.util.*;
public class PartyE {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int[] arr=new int[a];
    int[] arr1=new int[a];
    for(int i=0;i<a;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {
        arr1[i]=sc.nextInt();
    }
    int max_number=Integer.MIN_VALUE;
    for(int i=0;i<a;i++)
    {
        int s=arr[i]-arr1[i];
        max_number=Math.max(a, max_number);   
        if(i+1<a)
        arr[i+1]=arr[i+1]+s;
    }
    System.out.println(max_number);;
    }
}
