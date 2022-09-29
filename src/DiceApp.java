import java.util.Random;

public class DiceApp {
    public static void main(String[] args) {
        Random random = new Random();

        int roll1 = random.nextInt(7);

        System.out.println(roll1);
    }
}
