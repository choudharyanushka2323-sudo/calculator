import java.util.Scanner;

public class calculator{
    public static void main ( String [] arg ){

Scanner sc = new Scanner(System.in);

double num1;
double num2;
char operator;
double result=0;

    System.out.print("Enter first number : ");
    num1 = sc.nextDouble();

    System.out.print("Enter operator (+, -, *, /) : ");
      operator = sc.next().charAt(0);

    System.out.print("Enter second number : ");
     num2 = sc.nextDouble();

    

        switch( operator){

        
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;

    }
         
    System.out.println(" the result is : " + result);
    sc.close();
}}