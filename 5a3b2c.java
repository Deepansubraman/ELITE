import java.util.*;

class Noob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String c = ""; 

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (Character.isDigit(ch)) {
                c += ch; 
            }

            if (Character.isLetter(ch)) {
                    int count = Integer.parseInt(c);
                    for (int j = 0; j < count; j++) {
                        System.out.print(ch); 
                    }
                    c = ""; 
                }
            }
        }
    }

