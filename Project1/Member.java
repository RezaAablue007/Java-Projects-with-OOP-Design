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
public class Member extends Passenger {
    public int yearsOfMembership;
// Instance variable defined above.
    
    public Member (String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
// Constructor used to inherit values for name and age.
    
    @Override
    double applyDiscount (double p) {
        if (yearsOfMembership > 5) {
            System.out.println("The 50% discount is applied to the ticket!");
            return p*(0.5);
        }
        
        else if (yearsOfMembership > 1 && yearsOfMembership <= 5) {
            System.out.println("The 10% discount is applied to the ticket!");
            return p*(0.9);
        }
        
        else {
            System.out.println("Unfortunately, no discount is applied to the ticket!");
            return p;
        }
    }
// If the member has the membership for more than 5 years, then the 50% discount will be applied. If the
// member has the membership for more than 1 year but less than or equal to 5 years, then the 10% discount will
// be applied. Otherwise, there is no discount on the ticket price.
}