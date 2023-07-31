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
public abstract class Passenger {
    private String name;
    public int age;
//Instance variables defined above.
    
    public Passenger(String n, int a) {
        this.name = n;
        this.age = a;
    }
// Constructor used to instantiate instance variables.

    public String getName() {
        return this.name;
    }
    
    public void setName (String n) {
        this.name = n;
    }
// Getter and setter methods for name.

    public int getAge() {
        return this.age;
    }
    
    public void setAge (int a) {
        this.age = a;
    }
// Getter and setter methods for age.

    abstract double applyDiscount (double p);
// This class also has an abstract method double applyDiscount(double p).
// This method should be overridden by both the subclasses. In the subclasses, this applyDiscount
// method should return a price after applying the appropriate discount.
}