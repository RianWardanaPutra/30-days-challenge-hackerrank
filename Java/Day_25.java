import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //TODO: Make prime number decider algorithm
        Scanner sc = new Scanner(System.in);
        int numberOfInput = sc.nextInt();
        int[] numbers = new int[numberOfInput];
        for (int i = 0; i < numberOfInput; i++){
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers){
            int n = 3;
            int count = 0;
            if (number == 2){
                System.out.println("Prime");
                continue;
            }else if (number == 1 || (number & 1) == 0){
                System.out.println("Not prime");
                continue;
            }
            while (n <= Math.sqrt(number)){
                if (number % n == 0){
                    count++;
                }
                n++;
            }
            if (count != 0){
                System.out.println("Not prime");
            }else{
                System.out.println("Prime");
            }
        }
        sc.close();
    }
}

