/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Reza Aablue (500966944)
 */
public class NonMember extends Passenger {
    public NonMember (String name, int age) {
        super (name, age);
    }
// Constructor used to inherit values for name and age.

    @Override
    double applyDiscount (double p) {
        if (age > 65) {
            System.out.println("The 10% discount is applied to the ticket!");
            return p*(0.9);
        }
        
        else {
            System.out.println("Unfortunately, no discount is applied to the ticket!");
            return p;
        }
    }
// If the age of the person is more than 65 years old, 10% discount will be applied to the ticket price. Otherwise, no discount is applied.
}