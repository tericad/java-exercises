package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Double area;
        Double pi;
        Double radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = in.nextDouble();

        pi = 3.14;
        area = pi * (radius * radius);
        System.out.println("The area of the circle is " + area);
    }
}
