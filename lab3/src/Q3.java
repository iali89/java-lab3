import java.util.*;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        float cost , items ;
        System.out.print("Please enter the cost: ");
        cost = reader.nextFloat();
        System.out.print("Please enter the number of items purchased: ");
        items = reader.nextFloat();
        if(cost>500 && items>10){
            double discount = cost*0.8;

            System.out.println("The price after the discount is " + discount +" Riyals");
        } else if (cost<=500&&cost>=250&&items<=10) {
            float discount = (float) (cost*0.9);
            System.out.println("The price after the discount is " + discount +" Riyals");

        }
        else if (cost<250&&items>=3) {
            float discount = (float) (cost*0.95);

            System.out.println("The price after the discount is " + discount +" Riyals");

        }
        else {
            System.out.println("No Discount");
        }

    }
}
