import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        // Numbers From User
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        // If Statement About The Greater From Numbers
        if (num1 > num2 && num1 > num3) {
            System.out.println("Please enter three numbers:" + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The smallest number is :" + num2);
        }
        else if (num3>num1 && num3>num2) {
            System.out.println("The greater number is :" + num3);

        }
    }
}
