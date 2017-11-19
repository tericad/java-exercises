package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        MenuItem chickenSoup = new MenuItem("Chicken Noodle Soup",
                "Homemade Noodles in Broth with Shreadded Chicken and Carrots.",
                2.99f, "appetizer",new Date());

        MenuItem carbonara = new MenuItem("Carbonara",
                "Pasta with bacon, spinich, and chicken in a creamy white sauce.",
                12.99f, "main course", new Date());

        MenuItem brownie = new MenuItem("Brownie",
                "Chocolate brownie with caramel sauce and ice cream.",
                5.99f, "dessert", new Date());

        ArrayList<MenuItem> currentMenu = new ArrayList<MenuItem> ();
        Menu myMenu = new Menu(currentMenu, new Date());

        myMenu.addMenuItem(chickenSoup);
        myMenu.addMenuItem(carbonara);
        myMenu.addMenuItem(brownie);


        System.out.println(myMenu.toString());

        System.out.println(carbonara.toString());


    }
}
