import java.util.Scanner;

public class MathMethod {
    public static void main(String[] args) {

//        Exercise
//        Write java code to demonstrate each of the math method

        String choice;
        double num2 = 0.0;
        double num1 = 0.0;


        //user input for generating number
        Scanner myObj = new Scanner(System.in);
        System.out.println("Do you want to generate a random number?");
        choice = myObj.nextLine().toLowerCase();

        //if no then user input their number
        if (choice.charAt(0)=='n'){
            System.out.println("Please enter any random number (num1)");
            num1 = myObj.nextDouble();
            System.out.println("Please enter any random number (num2)");
            num2 = myObj.nextDouble();
        }
        //if yes then it generate random number
        else if(choice.charAt(0)=='y'){
            num1 = (int) Math.floor(Math.random()*101);
            num2 = (int) Math.floor(Math.random()*101);
        }


        //output for math methods
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Absolute: " + Math.abs(num1));
        System.out.println("Cosine: " + Math.acos(num1));
        System.out.println("Maximum number of " + num1 + " and " + num2 + " is: " +Math.max(num1, num2));
        System.out.println("Square root of " + num1 + " : " + Math.sqrt(num2));
        System.out.println("Power of " + num1 + " and " + num2 + "  : " + Math.pow(num1, num2));
        System.out.println("Logarithm of " + num1 + " : " + Math.log(num1));
        System.out.println("Logarithm of " + num2 + " : " + Math.log(num2));
        System.out.println("log10 of " + num1 + " : " + Math.log10(num1));
        System.out.println("log10 of " + num2 + " : "+ Math.log10(num2));
        System.out.println("log1p of " + num1 + " : " +Math.log1p(num1));
        System.out.println("Exponential of " + num1 + " : " +Math.exp(num1));
        System.out.println("Exponential - 1 of " + num1 + " : " +Math.expm1(num1));

    }
}
