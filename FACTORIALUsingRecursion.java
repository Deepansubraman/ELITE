import java.util.*;
class factorial{
    public static void main(String args[])
    {
        int n=5;
        int m=fact(n);
        result(m);
    }
    public static int fact(int n)
    {
        if (n == 0 || n == 1) {
            return 1;  
        }
        return n*(fact(n-1));
    }
    public static void result(int a)
    {
        System.out.println(a);
    }
}