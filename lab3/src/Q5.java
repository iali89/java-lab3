import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter a number (1-7): ");
        int day = reader.nextInt();
        if (day ==1)
            System.out.println("The day is Monday.");
        else if (day==2)
            System.out.println("The day is Tuesday.");
        else if (day==3)
            System.out.println("The day is Wednesday.");
        else if (day==4)
            System.out.println("The day is Thursday.");
        else if (day==5)
            System.out.println("The day is Friday.");
        else if (day==6)
            System.out.println("The day is Saturday. ");
        else if (day==7)
            System.out.println("The day is Sunday. ");



    }
}