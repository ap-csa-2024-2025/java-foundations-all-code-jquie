import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade level (number): ");
        int grade = sc.nextInt();
        System.out.println("Next year, you are in grade " + (grade+1));

        sc.close();
    }
}


