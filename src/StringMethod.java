import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {

//        Exercise
//        Write java code to demonstrate each of the string method

        String fullName = "Hazwan Izzani";
        String student1 = "";
        int index = 0;

        //user input for name
        Scanner myObj = new Scanner(System.in);
        if (student1.isEmpty()){
            System.out.println("Please enter the name of the student");
            student1 = myObj.nextLine();
        }
        //do while loop
        do if (fullName.contains(student1)) {
            System.out.println("School.Student " + student1 + " contains " + fullName);
            System.out.println("Do you want to change name of student? ");
            String choice = myObj.nextLine().toLowerCase();
            if (choice.charAt(0) == 'y') {
                System.out.println("\nPlease enter the new name of the student");
                student1 = myObj.nextLine();
            }
        }
        while (student1.isEmpty());

        System.out.println("Please enter any index of the string");
        index= myObj.nextInt();


         //output for string methods
        System.out.println("\nFull Name: " + fullName);
        System.out.println("School.Student Name: " + student1);
        System.out.println("Length: " + fullName.length());
        System.out.println("Character at index 0: " + fullName.charAt(0));
        System.out.println("Codepoint at index " + index + " : " + fullName.codePointAt(index));
        System.out.println("codePointBefore at index " + (index-1) + " : " + fullName.codePointBefore(index));
        System.out.println("codePointCount at index 0: " + fullName.codePointCount(0,index));
        System.out.println("Compare " + student1 + " and " + fullName + ": " + fullName.compareTo(student1));
        System.out.println("Compare " + student1 + " and " + fullName + " : " + fullName.compareToIgnoreCase(student1));
        System.out.println("Combine " + student1 + " and " + fullName + " : " + fullName.concat(student1));

        myObj.close();

    }
}
