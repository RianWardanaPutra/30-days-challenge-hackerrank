import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int jumlah = 0, maks = -70;
        for(int b=0; b<4; b++){
            for(int k=0; k<4; k++){
                jumlah = arr[b][k] + arr[b][k+1] + arr[b][k+2] + arr[b+1][k+1] + arr[b+2][k] + arr[b+2][k+1] + arr[b+2][k+2];
                //System.out.println(jumlah);
                if(jumlah>maks){
                    maks = jumlah;
                }
            }
        }
        
        System.out.println(maks);
        scanner.close();
    }
}