package bsu;

public class Calculator {

    public double sum(double a, double b){ return a+b;}
    public double subtract(double a, double b) {return a-b;}
    public double multiply(double a, double b){ return a*b;}
    public double divide(double a, double b){
        if (b!=0.0) {
            return a/b;
        }
        else return Double.POSITIVE_INFINITY;
    }


    public double result(double a, double b, char c){
        double result = 0.0;
        switch(c){
            case '+':
                result = sum(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result =  multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
            case 'n':
                break;
            default:
                System.out.println("Wrong char");
        }
        return result;
    }
}