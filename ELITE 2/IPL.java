import java.util.*;
public class IPL {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> team=new ArrayList<>();
       for(int i = 0; i < 12; i++)
        {
            String input = sc.nextLine();
            if(input.equals("Q")) {
                break;
            }
            team.add(input);
        }
        System.out.println("Total Matches: "+(team.size()*team.size()-1)/2);
        for(int i=0;i<team.size()-1;i++)
        {
            for(int j=i+1;j<team.size();j++)
            {
                System.out.println(team.get(i)+" VS "+team.get(j));
            }
        }
    }
}
