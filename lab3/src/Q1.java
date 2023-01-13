import java.util.*;
public class Q1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int length , breadth;
        System.out.print("Please enter a length: ");
        length=reader.nextInt();
        System.out.print("Please enter a breadth: ");
        breadth =  reader.nextInt();
        if(length==breadth)
            System.out.println("This is a square.");
        else
            System.out.println("This is NOT a square.");

    }

}
