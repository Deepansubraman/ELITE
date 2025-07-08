import java.util.*;
public class ReplaceCharacter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        for (int i = 0; i < str.length(); ) {
          
            if (i + 1 < str.length() && str.charAt(i) == 'E' && str.charAt(i + 1) == 'F') {
                i += 2;
            }
            else if (i + 1 < str.length() && str.charAt(i) == '5' && str.charAt(i + 1) == '6') {
                i += 2;
            }
           
            else if (str.charAt(i) == 'G') {
                i++;
            }
          
            else {
                s += str.charAt(i);
                i++;
            }
        }
        System.out.println(s);
        sc.close();
    }
}