import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Issue i1 = new Issue();

        Student s1 = new Student();
        // add student to student hashmap
        s1.add();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Id: ");
        int id = input.nextInt();

        // check if student is registered
        if (s1.student.containsKey(id)) {
            i1.getPurpose(id);
        }

        // ask if student want to register
        else {
            System.out.println("Be a member? yes or no");
            String answer = input.next();
            if (answer.equals("yes")) {
                s1.addStudent();
                System.out.println("You are registered.");
                i1.getPurpose(id);
            }
            else {
                System.out.println("Okay, bye");
            }
        }
   }
}