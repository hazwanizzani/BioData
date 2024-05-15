import java.util.Scanner;

public class GradingSystem {


    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the student's score: ");
        int score = myObj.nextInt();
        char grade;
        if (score>=90 && score <=100) {
            grade = 'A';
        }
        else if (score>=80 && score <=89) {
            grade = 'B';
        }
        else if (score>=70 && score <=79) {
            grade = 'C';
        }
        else if (score>=60 && score <=69) {
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("The student's grade: " + grade + " for score " + score);


        myObj.close();

    }
}
