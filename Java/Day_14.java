import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] arr){
        this.elements = arr;
    }

    void computeDifference() {
        int max = 0, diff = 0;
        for(int i = 0; i < this.elements.length; i++){
            for(int j = 0; j < this.elements.length; j++){
                if(this.elements[i] > this.elements[j]){
                    diff = this.elements[i] - this.elements[j];
                    //System.out.println(diff);
                }else if(this.elements[i] < this.elements[j]){
                    diff = this.elements[j] - this.elements[i];
                }
                if(diff > max){
                    max = diff;
                }
                //System.out.println(diff);
            }
            if(diff > max){
                max = diff;
            }
            //System.out.println(max);
        }
        maximumDifference = max;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}