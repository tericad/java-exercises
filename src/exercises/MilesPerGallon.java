package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Double miles;
        Double gallons;
        Double miles_per_gallon;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = in.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        gallons = in.nextDouble();
        miles_per_gallon = miles / gallons;
        System.out.println("Your Miles per Gallon is " + miles_per_gallon);
    }
}

