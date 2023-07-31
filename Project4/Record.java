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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Record {
    // I applied the Singleton design pattern to initialize an instance of the Record class.
    private static Record r = new Record("testFile.txt");
    // Name of the associated file
    private String filename;

    public Record(String n) 
        {filename = n;}

    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try {
            // mainScanner object of scanner type created to read the file. It continues to read the file
            // until there's no more data to read.
            Scanner mainScanner = new Scanner(new File (filename));
            while (mainScanner.hasNextLine()) {System.out.println(mainScanner.nextLine());}
            } 
        
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        }
 
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try {
            // Using writeFile object to write into the file. Initially set to true so that it works,
            // and becomes false if the IOException is caught.
            FileWriter writeFile = new FileWriter(filename, true);
            writeFile.write(msg);
            writeFile.close();
            } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        // Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");

        System.out.println("Currently the file record.txt " + "contains the following lines:");
        r.read();
    }
}