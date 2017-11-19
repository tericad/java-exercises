package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> itemList;
    private Date updated;

    public Menu(ArrayList<MenuItem> itemList, Date updated){
        this.itemList = itemList;
        this.updated = updated;
    }

    public ArrayList<MenuItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<MenuItem> itemList) {
        this.itemList = itemList;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public void addMenuItem(MenuItem item){
        itemList.add(item);
        setUpdated(new Date());
    }

    public void removeMenuItem(MenuItem item){
        itemList.remove(item);
        setUpdated(new Date());
    }

    public void menuUpdated(){
        System.out.println(updated);
    }

    public String toString(){
        String printMenu = "MENU";
        for(MenuItem entry : itemList){
            printMenu += entry.toString();
        }
        return printMenu;
    }
}
