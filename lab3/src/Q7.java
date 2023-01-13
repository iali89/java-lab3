import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 7: ");
        int day = reader.nextInt();
        switch (day){
            case 1 : System.out.println("The day is Sunday."); break ;
            case 2 : System.out.println("The day is Monday.");break ;
            case 3 : System.out.println("The day is Tuesday.");break ;
            case 4 : System.out.println("The day is Wednesday.");break ;
            case 5 : System.out.println("The day is Thursday.");break ;
            case 6 : System.out.println("The day is Friday.");break ;
            case 7 : System.out.println("The day is Saturday. ");break ;
        }
    }
}