import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create scanner object

        System.out.println("Please enter your name and surname");

        String name = scanner.next();
        String surname = scanner.next();

        System.out.println("Hello " + name + " " + surname);
    }
}