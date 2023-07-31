package lab2;

/**
 *
 * @author Reza Aablue (500966944)
 */
public class ProceduralAbstraction {
    
    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // (i.e. 1*2*3*…*n) is greater than or equal to x, for positive
    // integer x. Otherwise returns 1.
    public static int reverseFactorial(int x) {
        // When x is a positive integer, this procedure should return the smallest positive
        // integer "n" for which n! (i.e. 1*2*3*…*n) is greater than or equal to "x".
        
        // If the number is negative or zero, "1" is returned.
        if (x <= 0) {
            return 1;
        }
        // Initialize "n" and "factorial" instance variables to 1.
        int n = 1;
        int factorial = 1;
        
        // While loop used to 
        while (factorial < x) {
            // Increment "n" as long as factorial < x.
            n++;
            // Calculation of the factorial.
            factorial = factorial * n;
        }
        // Returning the result of "n".
        return n;
    }
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false.
    public static boolean isMatrixNice(int[][] arr) {
        // In order for the matrix to be a "nice matrix", it must be a square matrix
        // AND the sum of all of its rows, columns and digonal rows should be the same.
        
        // If the array is null or empty, "false" is returned.
        if (arr == null || arr.length == 0) {
            return false;
        }
        
        // Initialize sum.
        int sum = 0;
        
        // Check each row to make sure that the rows are full.
        for (int i = 0; i < arr.length; i++) {
            // If one row's length is different from another, "false" is returned.
            if (arr[i].length != arr.length) {
                return false;
            }
            // Initialize sum of the row to 0.
            int rowSum = 0;
            
            // For loop used to find the sum of the values in the row.
            for (int j = 0; j < arr[i].length; j++) {
                // Incrementing rowSum for each element in the row.
                rowSum += arr[i][j];
            }
            // For the first row, the rowSum is set as sum.
            if (i == 0) {
                sum = rowSum;
            }
            // Otherwise, if the sum of the row isn't equal to sum of current row, "false" is returned.
            else if (sum != rowSum) {
                return false;
            }
        }
        
        // Check each column to make sure that the columns are full.
        for (int i = 0; i < arr.length; i++) {
            // Initialize columnSum to 0.
            int columnSum = 0;
            
            for (int j = 0; j < arr.length; j++) {
                columnSum += arr[j][i];
            }
            // If the columnSum is not equal to sum, "false" is returned.
            if (columnSum != sum) {
                return false;
            }
        }
        
        // Calculating and checking the sum of the diagonal rows.
        int sumOne = 0, sumTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            // sumOne: top left to bottom right.
            sumOne += arr[i][i];
            // sumTwo: bottom left to top right.
            sumTwo += arr[arr.length - 1 - i][i];
        }
        
        // If either of the diagonals' sums are not equal to the sum, "false" is returned.
        if ((sumOne != sum) || (sumTwo != sum)) {
            return false;
        }
        // Otherwise, print out the sum of each row and return "true". This is only printed for a "nice" matrix.
        else {
            System.out.println("The sum of each row in the matrix below is " + sum + ".");
            return true;
        }
    }
        
        // The main method is used for test cases for both procedures.
        public static void main (String[] args) {
            System.out.println("The reverse factorial of 6 is " + reverseFactorial(6) + ".");
            System.out.println("The reverse factorial of 24 is " + reverseFactorial(24) + ".");
            System.out.println("The reverse factorial of 119 is " + reverseFactorial(119) + ".");
            
            // Testing matrix 1 from lab manual.
            int matrixOne[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
            if (isMatrixNice(matrixOne)) {
                System.out.println("This matrix is a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixOne[0][0] + " " + matrixOne[0][1] + " " + matrixOne[0][2]);
                System.out.println("\n" + matrixOne[1][0] + " " + matrixOne[1][1] + " " + matrixOne[1][2]);
                System.out.println("\n" + matrixOne[2][0] + " " + matrixOne[2][1] + " " + matrixOne[2][2]);
            }
            
            else {
                System.out.println("This matrix is NOT a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixOne[0][0] + " " + matrixOne[0][1] + " " + matrixOne[0][2]);
                System.out.println("\n" + matrixOne[1][0] + " " + matrixOne[1][1] + " " + matrixOne[1][2]);
                System.out.println("\n" + matrixOne[2][0] + " " + matrixOne[2][1] + " " + matrixOne[2][2]);
            }
            
            // Testing matrix 2 from lab manual.
            int matrixTwo[][] = {{-3, 1, 0}, {4, -3, 4}, {7, -9, 0}};
            if (isMatrixNice(matrixTwo)) {
                System.out.println("This matrix is a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixTwo[0][0] + " " + matrixTwo[0][1] + " " + matrixTwo[0][2]);
                System.out.println("\n" + matrixTwo[1][0] + " " + matrixTwo[1][1] + " " + matrixTwo[1][2]);
                System.out.println("\n" + matrixTwo[2][0] + " " + matrixTwo[2][1] + " " + matrixTwo[2][2]);
            }
            
            else {
                System.out.println("This matrix is NOT a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixTwo[0][0] + " " + matrixTwo[0][1] + " " + matrixTwo[0][2]);
                System.out.println("\n" + matrixTwo[1][0] + " " + matrixTwo[1][1] + " " + matrixTwo[1][2]);
                System.out.println("\n" + matrixTwo[2][0] + " " + matrixTwo[2][1] + " " + matrixTwo[2][2]);
                
            // Testing matrix 3 from lab manual.
            int matrixThree[][] = {{1, 1}, {1, 1}};
            if (isMatrixNice(matrixThree)) {
                System.out.println("This matrix is a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixThree[0][0] + " " + matrixThree[0][1]);
                System.out.println("\n" + matrixThree[1][0] + " " + matrixThree[1][1]);
            }
            
            else {
                System.out.println("This matrix is NOT a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixThree[0][0] + " " + matrixThree[0][1]);
                System.out.println("\n" + matrixThree[1][0] + " " + matrixThree[1][1]);
            }
            
            // Testing matrix 3 from lab manual.
            int matrixFour[][] = {{1, 2}, {3, 4}};
            if (isMatrixNice(matrixFour)) {
                System.out.println("This matrix is a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixFour[0][0] + " " + matrixFour[0][1]);
                System.out.println("\n" + matrixFour[1][0] + " " + matrixFour[1][1]);
            }
            
            else {
                System.out.println("This matrix is NOT a nice matrix: ");
                // Printing out the array below: 
                System.out.println("\n" + matrixFour[0][0] + " " + matrixFour[0][1]);
                System.out.println("\n" + matrixFour[1][0] + " " + matrixFour[1][1]);
            }
        }
    }
}