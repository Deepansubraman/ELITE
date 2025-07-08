import java.util.*;
public class Painting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        int c=sc.nextInt();
        double[] arr1=new double[c];
        double total=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
            total+=arr[i]*18;
        }
        for(int i=0;i<c;i++)
        {
            arr1[i]=sc.nextDouble();
            total+=arr1[i]*12;
        }
        System.out.println("Total estimated Cose: "+total+"INR");

}
}
