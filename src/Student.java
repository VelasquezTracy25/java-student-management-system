import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String status;
    private String studentId;
    private int id = 1000;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    //Constructor for 2 prompts in App (name and id)
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade level: \n1.Freshman\n2.Sophomore\n3.Junior\n4.Senior");
        this.gradeYear = in.nextInt();

        generateId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + studentId);
    }

//Generate ID

    private void generateId() {
//grade level +
        id++;
        this.studentId = gradeYear + "" + id;
    }

//Enroll in courses

//View balance

//Pay tuition

//Show current status


}
