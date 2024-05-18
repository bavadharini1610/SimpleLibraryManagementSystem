import java.util.HashMap;
import java.util.Scanner;

public class Student {
    HashMap<Integer,String> student = new HashMap<>();
    Scanner input = new Scanner(System.in);
    void add(){
        student.put(101,"John");
        student.put(102,"Sara");
    }
    void addStudent(){
        System.out.println("Enter the name of the student: ");
        String name = input.nextLine();
        System.out.println("Enter the ID of the Student: ");
        int id = input.nextInt();
        student.put(id,name);
    }
}
