import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int lec_instructor , lec_attended;
        Scanner reader = new Scanner(System.in);
        System.out.print("Number of lectures delivered from the instructor: ");
        lec_instructor = reader.nextInt();
        System.out.print("Number of lectures the student attended: ");
        lec_attended = reader.nextInt();
        if (lec_attended>75*lec_instructor/100){
            System.out.println("The student can take the exam");
        }
        else {
            System.out.println("The student CANNOT take the exam");
        }
    }
}
