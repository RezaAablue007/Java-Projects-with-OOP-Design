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

public class FoodComponent {
    private String name;
    
    public FoodComponent (String name) {this.name=name;}
    
    public String getName () {return name;}
    
    public void print (int level) {System.out.println(name);}
    
}