import javax.swing.JOptionPane;

public class GUIApp {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Hi! What's your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
    }

}
