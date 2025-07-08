import java.util.*;
public class sortUsingPriorityQueue {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element: "+(i+1));
            int s=sc.nextInt();
            pq.add(s);
        }
        int d=0;
        while(pq.size()>1)
        {
            int x=pq.poll();
            int y=pq.poll();
            int z=x+y;
            System.out.print(z+" ");
            pq.add(z);
            d+=z; 
        }
        System.out.println("added value: "+pq.poll());
        System.out.println(d);

    }
}
