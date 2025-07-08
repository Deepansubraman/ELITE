import java.util.*;
public class binaryOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = str.charAt(0) - '0';
        for(int i=1;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='A'){
                int num = str.charAt(i+1) - '0';
                ans = ans&num;
            }
            else if(ch == 'B'){
                int num = str.charAt(i+1) - '0';
                ans = ans|num;
            }
            else if(ch == 'C'){
                int num = str.charAt(i+1) - '0';
                ans = ans^num;
            }
        }
        System.out.println(ans);
    }
}