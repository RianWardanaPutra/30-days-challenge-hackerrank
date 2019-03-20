import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int jumlah = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<jumlah; i++){
            String kata = scan.nextLine();
            char[] huruf = kata.toCharArray();

            for(int j=0; j<huruf.length; j+=2){
                System.out.print(huruf[j]);
            }
            System.out.print(' ');
            for(int j=1; j<huruf.length; j+=2){
                System.out.print(huruf[j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
