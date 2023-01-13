import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length , width , perimeter;
        System.out.print("Please enter length: ");
        length = reader.nextInt();
        System.out.print("Please enter width: ");
        width = reader.nextInt();
        perimeter = 2*(width+length);
        System.out.println("The perimeter is " + perimeter);
    }
}