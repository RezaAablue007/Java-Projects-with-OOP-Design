/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Reza Aablue (500966944)
 */
public class Manager {
    ArrayList<Flight> flights = new ArrayList<Flight>();
// ArrayList of name "flights" defined above.
    
    public void createFlights() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your flight number: ");
        int number = scanner.nextInt();
        
        System.out.println("Please enter the origin: ");
        scanner.nextLine();
        String start = scanner.nextLine();
                
        System.out.println("Please enter the destination: ");
        String end = scanner.nextLine();
        
        System.out.println("Please enter the departure time: ");
        String depTime = scanner.nextLine();
        
        System.out.println("Please enter the capacity for the flight: ");
        int cap = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Please enter the original price of the ticket: ");
        double price = scanner.nextDouble();
        
        Flight flight = new Flight(number, start, end, depTime, cap, price);
        flights.add(flight);
    }
// createFlights method is used to access the scanner and scan for inputs of flight information.
    
    public void displayAvailableFlights (String start, String end) {
        for (Flight flight: flights) {
// the getNumberOfSeats method is redundant in this case, since there is only one booking happening during the testing stage.
            if ((flight.getNumberOfSeats() > 0) || ((flight.getDestination().equals(end)) && (flight.getOrigin().equals(start)))) {
                System.out.println(flight.toString());
            }
            
            else {
                System.out.println("There are no matching flights for the given information.");
            }
        }
    }
// This method should display all the available flights from origin to destination. It
// should display only those flights that are not yet fully booked.

    public Flight getFlight (int number) {
        for (Flight flight: flights) {
            if (flight.getFlightNumber() == number) {
                return flight;
            }
        }
        return null;
    }
// This method should return the Flight object for the specified flight number.
    
    public void bookSeat (int number, Passenger p) {
        for (Flight flight: flights) {
            if (flight.getFlightNumber() == number) {
                double price = p.applyDiscount(flight.getOriginalPrice());
                Ticket ticket = new Ticket(p, flight, price);
                System.out.println(ticket.toString());
            }
        }
    }
// This method tries to first find a flight for the given flightNumber. If the flight exists,
// it tries to book a seat on that particular flight. If booking is successful, a discount may be
// applied on the ticket depending on the passenger being a member or a non-member. Finally, a 
// ticket is issued with the final price.    
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("The first test is conducted on the createFlights method.");
        manager.createFlights();
        
        System.out.println("For testing the getFlight method, please enter the flight number of the flight added above: ");
        int number = mainScanner.nextInt();
        System.out.println(manager.getFlight(number));
        
        System.out.println("Now, for displaying all available flights: ");
        mainScanner.nextLine();
        System.out.println("Please enter the origin of your flight: ");
        String start = mainScanner.nextLine();
        System.out.println("Please enter the destination of your flight: ");
        String end = mainScanner.nextLine();
        manager.displayAvailableFlights(start, end);
        
        System.out.println("Finally, we will be testing the bookSeat method.");
        System.out.println("Please enter your name: ");
        String name = mainScanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = mainScanner.nextInt();
        System.out.println("We will now be checking if you are a member of the frequent flyers club or not. "
                + "Please enter the digit 1 if you are a member, or enter the digit "
                + "2 if you are a non-member of the frequent flyers club.");
        int memberStatus = mainScanner.nextInt();
        
        if (memberStatus == 1) {
            System.out.print("Pleasure having you back! Please enter the number of years"
                    + " that you've been part of our frequent flyers club: ");
            int yearsOfMembership = mainScanner.nextInt();
            Member member = new Member (name, age, yearsOfMembership);
            System.out.println("Now, please enter the flight number of the flight you wish to book: ");
            number = mainScanner.nextInt();
            manager.bookSeat(number, member);
        }
        
        if (memberStatus == 2) {
            System.out.println("Please enter the flight number of the flight you wish to book: ");
            number = mainScanner.nextInt();
            NonMember nonMember = new NonMember (name, age);
            manager.bookSeat(number, nonMember);
        }
        
        System.out.println("This concludes the testing of the flight booking system.");
    }
// The main method calls all the other methods of the Manager class to see if they work or not.
}