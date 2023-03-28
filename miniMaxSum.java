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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) 
    {
    // Write your code here

        // sort the array and initialize
        Collections.sort(arr);
        long minimumSum = 0;
        long maximumSum = 0;
    
        for (int i = 1; i < arr.size(); i++) // iterate i (forwards) until reaches size of array
        {
            maximumSum += arr.get(i); // increment max each space of i in array
        }
    
        for (int j = arr.size()-2; j > -1; j--) // iterate j (backwards) starting 2 places from end of array; must be positive
        {
            minimumSum += arr.get(j); // increment min each space of j in array
        }
        System.out.println(minimumSum + " " + maximumSum); // print the totals for min and max
        
        // solved
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

