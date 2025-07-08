import java.util.*;
public class AutoMobile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Vehicle: ");
        int Vehicle=sc.nextInt();
        System.out.print("Wheels: ");
        int Wheels=sc.nextInt();
        if (Wheels%2!=0) {
        System.out.println("Invalid Input");  
        return;          
        }
        System.out.println("Four Wheeler: "+((Wheels-(2*Vehicle))/2));
        System.out.println("Two Wheeler: "+(4*Vehicle-Wheels)/2);
        System.out.println("Total Vehicles: "+Vehicle);
        System.out.println("Total Wheels: "+Wheels);
    }
}
