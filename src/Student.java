import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int gradeYear;
    private String status;
    private String studentId;
    private int id = 1000;
    private String courses = null;
    private int tuitionBalance = 0;
    private final int costOfCourse = 600;

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

    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("q")) {
                courses = courses + "" + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: $" + tuitionBalance);
    }

//View balance

//Pay tuition

//Show current status


}
