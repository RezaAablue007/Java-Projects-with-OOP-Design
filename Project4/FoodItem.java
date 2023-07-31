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
public class FoodItem extends FoodComponent {
    private double price;
    
    public FoodItem (String name, double price) {
        super(name);
        this.price=price;}
    
    public double getPrice () {return price;}
    
    public void print (int level) {
        String space = "";
        for (int i=0; i < level; i++) {
            space+="\t"; // The \t is used to move on to a new line.
        }
        System.out.printf("%sFoodItem : %s, %.2f\n", space, getName(), getPrice());
        // Formatting with printf is used for the print() method to print out the description of the FoodItem.
    }
}