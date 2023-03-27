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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

        double posValues = 0; // initialize
        double negValues = 0; // initialize
        double zeroValues = 0; // initialize
        
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i) > 0) // positive values
            {
                posValues++; // increment
            }
            else if (arr.get(i) < 0) // negative values
            {
                negValues++; // increment
            }
            else // zero values
            {
                zeroValues++; // increment
            }
        }
        
        System.out.println(posValues / arr.size()); // prints ratio for positive values divided by the size of array
        System.out.println(negValues / arr.size()); // prints ratio for negative values divided by the size of array
        System.out.println(zeroValues / arr.size()); // prints ratio for zero values divided by the size of array
    }

    // solved
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
