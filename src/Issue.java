import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Issue {
    HashMap<Integer, String > issue = new HashMap<>();
    Book b1 = new Book();
    Student s1 = new Student();
    Scanner input = new Scanner(System.in);
    public Issue(){
        b1.add();
        s1.add();
    }

    void issueBook(int id){
        int bookId = 0;
        System.out.println("enter a book");
        String bookName = input.nextLine();
        if(b1.books.containsValue(bookName)){
            for(Map.Entry<Integer, String> entry :b1.books.entrySet()){
                if(entry.getValue().equals(bookName)){
                    bookId = entry.getKey();
                    break;
                }
            }
            b1.books.remove(bookId);
            issue.put(bookId,bookName);
            String name = s1.student.get(id);

            // print name and issued book
            System.out.println("Name: " + name);
            System.out.println("Book: " + bookName);
            System.out.println("Book issued Congratulation");
        }

        else {
            System.out.println("Book doesn't exist");
            System.out.println("We have following Books:");
            System.out.println(b1.books);
        }

        }

        void returnBook(int id){
        issue.put(101,"The good book");
            System.out.println(issue.containsValue(id));
            if (issue.containsKey(id)) {
                System.out.println("enter a book to return: ");
                String bookName = input.nextLine();

                //get book id
                int bookId = 0;
                // iterate each entry of hashmap
                for (Map.Entry<Integer, String> entry : b1.books.entrySet()) {

                    // if give value is equal to value from entry
                    // print the corresponding key
                    if (entry.getValue().equals(bookName)) {
                        bookId = entry.getKey();
                        break;
                    }
                }

                // check if book is issued
                if (issue.containsValue(bookName)) {

                    // remove issue record form issue HashMap
                    issue.remove(id);

                    // add book back to book hashmap
                    b1.books.put(bookId, bookName);

                    // print name of student and book
                    // get student name from id
                    String name = s1.student.get(id);
                    System.out.println("Name: " + name);
                    System.out.println("Book: " + bookName);
                    System.out.println("Book returned");

                }

                else {
                    System.out.println("Book is not issued.");
                }

            }
            else {
                System.out.println("You haven't issued any book");
            }
        }
    void getPurpose(int id) {

        Issue i1 = new Issue();
        String purpose;

        System.out.println("Enter your purpose: return or issue");
        purpose = input.next();

        if (purpose.equals("issue")) {

            i1.issueBook(id);

        }
        else if (purpose.equals("return")) {

            i1.returnBook(id);
        }
    }
}




