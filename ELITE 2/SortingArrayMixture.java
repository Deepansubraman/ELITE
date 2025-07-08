import java.util.*;
public class SortingArrayMixture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n/2;
        int[] arr=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        Arrays.sort(arr);
        for(int i=0;i<b+1;System.out.print(arr[i++]+" "));
        for(int i=n-1;i>b;System.out.print(arr[i--]+" "));
    }
}
