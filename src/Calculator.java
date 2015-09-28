import java.util.Scanner;
import java.io.*;

/**
 * Created by Сергей on 14.09.2015.
 */

public class Calculator {
    public static int sum(int a, int b){ return a+b;}
    public static int subtract(int a, int b) {return a-b;}
    public static int multiply(int a, int b){ return a*b;}
    public static int divide(int a, int b){
        if (b!=0) {
            return a/b;
        }
        else return -1;
    }

    public static void main(String[] args){
        int a = 0, b = 0;
        char c = ' ';
        System.out.println("Enter your first integer: ");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else{
            System.out.println("Not an integer");
        }

        System.out.println("Enter your action: ");
        try{
            c = (char)System.in.read();
        }
        catch (IOException e){
            System.out.println("Input error!");
        }

        boolean action=false;
        switch(c){
            case '+':
                action=true;
                break;
            case '-':
                action=true;
                break;
            case '*':
                action=true;
                break;
            case '/':
                action=true;
                break;
            default:
                action = false;
                System.out.println("Wrong action");
        }

        if(action){
            System.out.println("Enter your second integer: ");
            if(sc.hasNextInt()){
                b = sc.nextInt();
            }
            else{
                System.out.println("Not an integer");
            }

        switch(c){
            case '+':
                System.out.println(" = " + sum(a, b));
                break;
            case '-':
                System.out.println(" = " + subtract(a, b));
                break;
            case '*':
                System.out.println(" = " + multiply(a, b));
                break;
            case '/':
                System.out.println(" = " + divide(a, b));
                break;
            default:
                System.out.println("Wrong char");
        }
        }
    }
}
