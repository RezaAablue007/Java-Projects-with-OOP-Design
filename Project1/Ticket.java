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
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int ticketNumber;
//Instance variables defined above.
    
    public Ticket (Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
    }
// Constructor used to instantiate instance variables.
    
    public Passenger getPassenger() {
        return this.passenger;
    }
    
    public void setPassenger (Passenger p) {
        this.passenger = p;
    }
// Getter and setter methods for passenger.
    
    public Flight getFlight() {
        return this.flight;
    }
    
    public void setFlight (Flight f) {
        this.flight = f;
    }
// Getter and setter methods for flight.
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice (double p) {
        this.price = p;
    }
// Getter and setter methods for price.
    
    @Override
    public String toString() {
        return (passenger.getName() + ", Flight " + flight.getFlightNumber() + ", " + 
                flight.getOrigin() + " to " + flight.getDestination() + " , " + flight.getDepartureTime()
                + ", Original Price: $ " + flight.getOriginalPrice() + " , Ticket Price: " + this.price);
    }
// Override the toString() method that returns a String representation of a Ticket object. The String should include the passenger’s name,
// information about the flight (the flight number, the origin, the destination, the departure, and the original price) and the actual ticket price.
}