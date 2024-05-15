public class Employee {
    public static void main(String[] args) {
        String name = "Hazwan Izzani";
        int age = 26;
        String dateOfBirth = "31/01/1998";
        String gender = "Male";
        String homeAddress = "Bangi, Selangor";
        String placeOfBirth = "Subang Jaya, Selangor";
        double salary = 3000.00f;

        System.out.println("Employee Data \n"
                + " ----------------------------\n"
                + "Name: " + name + " \n"
                + "Age: " + age + " \n"
                + "Date of birth: " + dateOfBirth   + " \n"
                + "Gender: " + gender   + " \n"
                + "Place of birth: " + placeOfBirth   + " \n"
                + "Home Town: " + homeAddress + " \n"
                + " ----------------------------\n"
                + "Salary: RM" + salary   + " \n"
        );
    }
}
