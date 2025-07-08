import java.util.*;
public class ChainMarketing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>mp=new HashMap<>();
        String d=sc.nextLine();
        char c=sc.nextLine().charAt(0);
        String s=sc.nextLine();
        if(c=='Y' || c=='y')
        {
            String[] arr=s.split(",");
            for(String str:arr)
            {
                mp.put(str,mp.getOrDefault(str, 0)+250);
                mp.put(d,mp.getOrDefault(d, 0)+500);
            }
        }
        else
        {
            System.out.println(d+"=250");
        }
        System.out.println(mp);
    }
}
