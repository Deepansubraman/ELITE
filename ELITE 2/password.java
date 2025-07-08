import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pass=sc.nextLine();
        int a=passwor(pass);
        System.out.println(a);
    }

public static int passwor(String pas)
{
    
    if( (int)pas.charAt(0)>=48 && (int)pas.charAt(0)<=57)
    {
        return 0;
    }
    int charCount=0;
    int digitcount=0;
    int capitalcount=0;
    for(int i=0;i<pas.length();i++)
    {
        char ch=pas.charAt(i);
        if(pas.charAt(0)==' ' || pas.charAt(0)=='/')
        {
            return 0;
        } 
        int as=(int)ch;
        if(as>=65 && as<=90)
        {
            capitalcount++;
        } 
        if(as>=48 && as<=57)
        {
            digitcount++;
        }
    }
    if(capitalcount==0 || digitcount==0)
    {
        return 0;
    }
    if(pas.length()>4)
    {
       return 0; 
    }
    return 1;
}
}
