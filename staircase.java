import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
       
        for(int i = 0; i < n;i++) // iterate i++ from 0 to n
        {
            for(int j = 0; j < n;j++) // second iteration j++ from 0 to n
            {
                if(j < n-1-i) // if n - 1 - i is still greater than j
                {
                    System.out.print(" "); // print a space (before the stairs)
                }
                else
                {
                    System.out.print("#"); // print the stairs
                }
            }
            System.out.println(""); // no space
        }
    }
    
    // solved

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
