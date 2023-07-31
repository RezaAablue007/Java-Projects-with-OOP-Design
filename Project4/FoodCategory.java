/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Reza Aablue
 */
import java.util.ArrayList;
public class FoodCategory extends FoodComponent {
    
    private ArrayList<FoodItem> items = new ArrayList<>();
    private ArrayList<FoodCategory> categories = new ArrayList<>();
    
    public FoodCategory (String name) {super(name);}
    
    public void add (FoodComponent component) {
        if (component instanceof FoodItem) {
            items.add((FoodItem) component);
        }
        
        else if (component instanceof FoodCategory) {
            categories.add((FoodCategory) component);
        }
    }
    
    public double getPrice() {
        double price = 0.0;
        for (FoodItem i: items) {
            price += i.getPrice();
        }
        return price;
    }
    
    public double totalPrice() {
        double totalPrice = 0;
        for (FoodItem i : items) {
            totalPrice += i.getPrice();
        }
        
        for (FoodCategory j : categories) {
            totalPrice += j.totalPrice();
        }
        return totalPrice;
    }
    
    public void print(int level) {
        String space = "";
        for (int k=0; k<level; k++) {
            space += "\t";
        }

        double totalPrice = totalPrice();
        
        for (FoodItem i : items) {
            totalPrice += i.getPrice();
        }
        System.out.printf("%sFood Category (%s,%.2f) contains \n", space, getName(), totalPrice());
        // Formatting with printf is used for the print() method. The %s determines the spaces required for indentation,
        // the %.2f is the accuracy of the food price (down to 0.01), and \n indicates the end of the line and moving
        // into a new line.
        
        for (FoodCategory j : categories) {j.print(level+1);}
        for (FoodItem i : items) {i.print(level+1);}
        
    }
}