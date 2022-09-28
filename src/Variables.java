public class Variables {
    public static void main(String[] args) {
        // primitive DTs:

        int x = 213;
        float y = 2899.01f;
        double y2 = 23.099999;
        char symb = '$'; // stores one character

        // reference DTs:

        String hi = "Hello!"; // stores multiple characters

        System.out.println(hi);

        // switching variables:

        String fruit1 = "Pear";
        String fruit2 = "Apple";

        System.out.println("fruit1: " + fruit1);
        System.out.println("fruit2: " + fruit2 + "\n");

        String temp; // declare empty variable

        temp = fruit1; // store x in temp
        fruit1 = fruit2; // assign y to x
        fruit2 = temp; // assign x (stored in temp) to y

        System.out.println("fruit1: " + fruit1);
        System.out.println("fruit2: " + fruit2);
    }
}


