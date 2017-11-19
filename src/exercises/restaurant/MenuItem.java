package exercises.restaurant;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.MONTH;

public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private final Date created;



    public MenuItem(String name, String description, double price, String category, Date created){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreated() {
        return created;
    }

    public Boolean isNew(MenuItem item){

        Calendar ago = new GregorianCalendar();
        ago.add(MONTH,-1);

        int between = item.created.compareTo(ago.getTime());
        if(between <= 0){
            return false;
        }
        else{
            return true;
        }
    }

}
