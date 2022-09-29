public class Expressions {
    public static void main(String[] args) {

        int fruits = 10;
        fruits++; // add one to our fruits value
        fruits--; // minus one
        System.out.println(fruits);

        int totalFruits = fruits / 3;

        System.out.println(totalFruits); // this will truncate decimals

        double dFruits = fruits; // store fruits as double
        double totalFruits2 = (double) dFruits/3; // this will not truncate decs

        System.out.println(totalFruits2);
    }
}
