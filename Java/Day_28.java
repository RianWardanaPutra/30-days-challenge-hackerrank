import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("(@gmail.com)");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);

            if (m.find()) {
                sb.append(firstName + " ");
            }

        }

        String names = sb.toString();
        ArrayList<String> sortedName = new ArrayList<>();
        for (String i : names.split(" ")) {
            sortedName.add(i);
        }
        Collections.sort(sortedName);

        for (String i : sortedName) {
            System.out.println(i);
        }

        scanner.close();
    }
}
