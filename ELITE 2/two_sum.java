import java.util.*;
public class two_sum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for(int i = 0; i < a; i++)
        {
            b[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Arrays.sort(b); 
        int[] r = sum(b, t);
            System.out.println(r[0] + " " + r[1]);
    }
    public static int[] sum(int[] b, int t)
    {
        int i = 0;
        int j = b.length - 1;
        while(i < j)
        {
            if(b[i] + b[j] == t)
            {
                return new int[]{b[i], b[j]};
            }
            else if(b[i] + b[j] > t)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return new int[0];
    }
}