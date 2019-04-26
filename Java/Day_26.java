import java.io.*;
import java.util.*;

class Solution {

    /*TODO: Print a single integer denoting the library fine for the book received as input.

    //The first line contains  space-separated integers denoting the respective , , and  on which the book was actually returned. 
    //The second line contains  space-separated integers denoting the respective , , and  on which the book was expected to be returned (due date).
    //
    //Output Format
    //
    //Print a single integer denoting the library fine for the book received as input.
    */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int fine = 0;
        int dayReturned = sc.nextInt();
        int monthReturned = sc.nextInt();
        int yearReturned = sc.nextInt();

        int dayExpected = sc.nextInt();
        int monthExpected = sc.nextInt();
        int yearExpected = sc.nextInt();
        
        if(yearReturned > yearExpected){
            fine = 10000;
        } else if (yearReturned == yearExpected) {
            if(monthExpected < monthReturned){
                fine = (monthReturned - monthExpected) * 500;
            } else if (monthReturned == monthExpected) {
                if(dayReturned > dayExpected){
                    fine = (dayReturned - dayExpected) * 15;
                }
            }
        }
        System.out.println(fine);
        sc.close();
    }
}
