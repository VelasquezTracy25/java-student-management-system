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

        System.out.println(firstName + " " + lastName + " " + studentId);
    }

//Generate ID

    private void generateId() {
//grade level +
        id++;
        studentId = gradeYear + "" + id;
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
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        System.out.println("What is the payment amount?");
        Scanner in = new Scanner(System.in);
        int payment= in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment + ".");
        System.out.println("Your remaining balance is: $" + tuitionBalance);

    }

//Show current status


}
