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
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
// Instance variables defined above.
    
    public Flight (int number, String start, String end, String depTime, int cap, double price) {
        flightNumber = number;
        origin = start;
        destination = end;
        departureTime = depTime;
        capacity = cap;
        originalPrice = price;
    
// Constructor used to instantiate instance variables.
    if (origin.equals(destination)==true) {
        throw new IllegalArgumentException("The origin and destination cannot be the same!");}
// If the specified origin and destination are equal, an IllegalArgumentException is thrown to abort the construction.
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber (int number) {
        flightNumber = number;
    }
// Getter and setter methods for flightNumber.
    
    public String getOrigin () {
        return origin;
    }
    
    public void setOrigin(String start) {
        origin = start;
    }
// Getter and setter methods for origin.
    public String getDestination () {
        return destination;
    }
    
    public void setDestination(String end) {
        destination = end;
    }
// Getter and setter methods for destination.
    
    public String getDepartureTime () {
        return departureTime;
    }
    
    public void setDepartureTime (String depTime) {
        departureTime = depTime;
    }
// Getter and setter methods for departureTime.
    
    public int getCapacity () {
        return capacity;
    }
    
    public void setCapacity (int cap) {
        capacity = cap;
    }
// Getter and setter methods for capacity.
    
    public int getNumberOfSeats () {
        return numberOfSeatsLeft;
    }
    
    public void setNumberOfSeats (int n) {
        numberOfSeatsLeft = n;
    }
// Getter and setter methods for numberOfSeatsLeft.
    
    public double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(double price) {
        originalPrice = price;
    }
// Getter and setter methods for originalPrice.
    
    public boolean bookASeat () {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        }
        
        else {
            return false;
        }
    }
// bookASeat method used to book seats on the flight and it checks to see whether there are any seats left or not.
    
    @Override
    public String toString () {
        return ("Flight Number: " + this.flightNumber + ", " + this.origin + " to " + this.destination + 
                ", Departing at: " + this.departureTime + ", original price: $" + this.originalPrice);
    }
// Override the toString method that returns a String representation of a Flight object. The String should include 
// the flight number, the origin, the destination, the departure time, and the original price.
}