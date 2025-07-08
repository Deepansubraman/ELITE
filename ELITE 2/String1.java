import java.util.*;
public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char c=sc.next().charAt(0);
        boolean v=s.indexOf(c)!=-1;
        System.out.println(v);
    }
}
