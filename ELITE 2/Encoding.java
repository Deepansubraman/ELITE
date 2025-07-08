import java.util.*;
public class Encoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int key=sc.nextInt();

        String s="";
        for(char c: str.toCharArray())
        {
            if(c>='A' && c<='Z')
            {
                int A=c-'A';
                A=A+key;
                A=A%26;
                char n=(char)(A+65);
                s=s+n;
            }
            else if(c>='a' && c<='z')
            {
            int a= c-'a';
            a=(a+key);
            a=a%26;
            char n=(char)(a+97);
            s=s+n;
            }
            else if(c>= '0' && c<= '9')
            {
                int num = (c - '0' + key) % 10;
                char n = (char) (num + '0');
                s += n;
            }
            else
            {
                s=s+c;
            }
        }
        System.out.println(s);
    }
}
