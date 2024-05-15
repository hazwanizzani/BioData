package School;

public class Student {

    //initialise the variables
    private String studentId;
    private String studentName;
    private int studentGrade;


    public Student(String studentIdIn, String studentNameIn, int studentGradeIn){
        this.studentId = studentIdIn;
        this.studentName = studentNameIn;
        this.studentGrade = studentGradeIn;
    }
    /*
    Below is the setters and getters
    for :

    studentId
    studentName
    studentGrade

    */


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void displayStudentName() {
        System.out.println(studentName);
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
}
