import java.util.*;

public class Main {
   public static void main(String[] args) {
      PriorityQueue<Integer> p = new PriorityQueue<Integer>();

      p.add(10);
      p.add(34);
      p.add(3);
      p.add(20);
      p.add(1);
      p.add(-1);
      System.out.println(p.peek());
      System.out.println(p.poll());
      System.out.println(p.peek());
      System.out.println(p.poll());
      System.out.println(p.poll());
   }
}