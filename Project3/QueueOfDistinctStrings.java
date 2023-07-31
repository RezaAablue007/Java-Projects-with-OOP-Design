package lab3;

/**
 *
 * @author Reza Aablue
 */

import java.util.ArrayList;
public class QueueOfDistinctStrings {
    // Overview: QueueOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // FIFO (First-In-First-Out) order.
    //
    // The abstraction function is:
    // a) Write the abstraction function here
    // AF(c) = an abstract queue "d", where "c" is a QueueOfDistinctStrings object in java
    // d.front = c.items.get(0), where items[0] = "ab", items[1] = "cd", items[2] = "ae", and items[3] = "bd"
    // d.end = c.items.get(items.size - 1) (since the array index starts from 0, the last string in the queue is represented by items.size - 1)
    //
    // The rep invariant is:
    // b) Write the rep invariant here
    // The rep invariant is: 
    // RI(c) is true if: c.items.get(i) != null && !(c.items.get(i).equals(c.items.get(j))) for (int i = 0, and i < items.size, and i++)
    // and for (j = i + 1, and j < items.size, and j++). Essentially, RI(c) is true if all elements are unique and none of them are null.
    // Otherwise, RI(c) is false.
    //
    private ArrayList<String> items;
    // constructor
     public QueueOfDistinctStrings () {
    // EFFECTS: Creates a new QueueOfDistinctStrings object
    items = new ArrayList<String>();
    }
    // MODIFIES: this
    // EFFECTS: Appends the element at the end of the queue
    // if the element is not in the queue, otherwise
    // does nothing.
    public void enqueue(String element) throws Exception {
        if(element == null) {throw new Exception();}
        if(false == items.contains(element)) 
            {items.add(element);}
        
    }
    public String dequeue() throws Exception {
    // MODIFIES: this
    // EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) 
            {throw new Exception();}
        return items.remove(0);
    }

    public boolean repOK() {
    // EFFECTS: Returns true if the rep invariant holds for this
    // object; otherwise returns false
    // c) Write the code for the repOK() here
        QueueOfDistinctStrings testQueue = new QueueOfDistinctStrings();
        if (testQueue.items == null) {
            return false;
        }
        
        for (int i=0; i<testQueue.items.size(); i++) {
            if (testQueue.items.get(i) == null) {
                return false;
            }
        }
        
        for (int i=0; i<testQueue.items.size(); i++) {
            for (int j = i + 1; j<testQueue.items.size(); j++) {
                if (testQueue.items.get(i).equals(testQueue.items.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public String toString() {
    // EFFECTS: Returns a string that contains the strings in the
    // queue, the front element and the end element.
    // Implements the abstraction function.
    // d) Write the code for the toString() here
        String result = "";
        if (items == null)
            {return "The queue is empty. All elements are null.";}
        for (String s : items) 
            {result = result + " " + s;}
        return result;
    }
}