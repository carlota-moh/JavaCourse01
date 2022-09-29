import java.util.Scanner;

public class AreaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your first number: ");
        double x = scanner.nextDouble();

        System.out.println("Insert your second number: ");
        double y = scanner.nextDouble();
        double area = x*y;

        System.out.println("The area of the rectangle is: "+area);
    }
}
