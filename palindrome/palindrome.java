package palindrome;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String chk = "";

        for(int i = (s.length())-1 ; i>=0; i--){

            chk = chk+s.charAt(i);

        }

        System.out.print(chk + "=chk");

        if(chk.equals(s)){
            System.out.print(" is Palindrome");

        }
        else{
            System.out.print(" is not Palindrome");
        }

        String a = "apple";

       // System.out.println(a.charAt(3));

        
    }
    
}
