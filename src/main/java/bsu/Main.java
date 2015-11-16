package bsu;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        double a = 0.0, b = 0.0;
        char c = ' ';
        boolean calculate = true;
        Calculator calculator = new Calculator();

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("Not a number");
        }

        while(calculate) {
            System.out.println("Enter the action");
            try {
                c = (char) System.in.read();
            } catch (IOException e) {
                System.out.println("Input error!");
            }
            String c2 = "" + c;
            Pattern p1 = Pattern.compile("[-\\+\\*/]");
            Matcher m1 = p1.matcher(c2);
            boolean m = m1.matches();

            if (m) {
                System.out.println("Enter the number");
                if (sc.hasNextDouble()) {
                    b = sc.nextDouble();
                    System.out.println(a + " " + c + " " + b + " = "+calculator.result(a, b, c));
                } else {
                    System.out.println("Not a number");
                }
            } else if(c == 'n') {
                calculate = false;
            }

            a = calculator.result(a,b,c);
        }
        sc.close();
    }
}