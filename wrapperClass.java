import java.util.*;
public class wrapperClass
{
public static void main(String[] args) {
   int i=20; //primitive data Type
   
   Integer a=Integer.valueOf(15); // Boxing, wrapping
   
   int  b=a.intValue(); //unboxing
   
   Integer c=20; //Integer.valueOf() - autoboxing.
   
   int d= 32; //autounboxing.
   
   String s="123";
   int e=Integer.parseInt(s); // ststic method from Integer class.
   
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   System.out.println(d);
   System.out.println(e);
   

}
}