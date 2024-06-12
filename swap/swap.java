package swap;

import java.util.Scanner;

class swap {

    public static void main(String[] args) {
        
       // without user input

        // int a = 5;
        // int b =7;

        // a=a+b;  // a=5+7   =12
        // b=a-b;  // b=12-7  =5
        // a=a-b;   // a=12-5  =7

        // System.out.println(a);
        // System.out.println(b);


        // user input

       Scanner scan = new Scanner(System.in);

       int a = scan.nextInt();
       int b = scan.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("value of a is ="+ a);
        System.out.println("value of b is ="+ b);

       
    }
}