package jcalculator;
import java.util.*;

public class jcalculator {
    public static void main(String[] args){

        while (true){
            System.out.println("****************");
            System.out.println("Java Calculator");
            System.out.println("****************\n");

            //Declare instance of Scanner object for user integer input
            Scanner s;
            s = new Scanner(System.in);

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Multiply");
            System.out.println("5. Exit");

            //Take in what option user types
            System.out.println("Please choose a function you would like to perform by typing in a number, eg: type 1 for Add");
            int userkey = s.nextInt();

            //If user types in number 5, kill program
            if (userkey==5){
                System.out.println("Thank you for using this software.");
                break;
            }

            //Otherwise, allow user to perform calculations
            else {
                //Take in number 1 and number 2
                System.out.println("Enter two numbers: ");
                double userNumber1 = s.nextDouble();
                double userNumber2 = s.nextDouble();

                /*
                Enhanced switch statement for each case,
                1=add, 2=sub, 3=divide, 4=multiply
                Cases call calcAdd, calcSubtract, calcDivide or calcMultiply function,
                with userNumber1 and userNumber2 as parameters to that function,
                based on what arithmetic the user wants to perform
                */
                switch (userkey) {
                    case 1 -> calcAdd(userNumber1, userNumber2);
                    case 2 -> calcSubtract(userNumber1, userNumber2);
                    case 3 -> calcDivide(userNumber1, userNumber2);
                    case 4 -> calcMultiply(userNumber1, userNumber2);
                    default -> System.out.print("No valid option. Please try again\n\n\n");
                }
            }
        }
    }

    public static void calcAdd(double number1, double number2){
        double answer = number1 + number2;
        System.out.println("Answer: \n" + answer + "\n\n\n");
    }

    public static void calcSubtract(double number1, double number2){
        double answer = number1 - number2;
        System.out.println("Answer: \n" + answer + "\n\n\n");
    }

    public static void calcDivide(double number1, double number2){
        double answer = number1 / number2;
        System.out.println("Answer: \n" + answer + "\n\n\n");
    }

    public static void calcMultiply(double number1, double number2){
        double answer = number1 * number2;
        System.out.println("Answer: \n" + answer + "\n\n\n");
    }
}
