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

class Result 
{

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) 
    {
        String[] conversion = s.split(":");
        Integer newHour = Integer.parseInt(conversion[0]); // hour turns into an integer
        String[] noSign = conversion[2].split("[AP]"); // discards the AM/PM from the last part (seconds)
        
        if (newHour == 12 && conversion[2].indexOf("A") == 2)
        {
          return "00" + ":" + conversion[1] + ":" + noSign[0]; // 12am
        }
        
        if(conversion[2].indexOf("P") == 2 && newHour < 12)
        {
          newHour += 12;
          String pastPM = Integer.toString(newHour);
          return pastPM + ":" + conversion[1] + ":" + noSign[0]; // 12am
        }
        
        return conversion[0] + ":" + conversion[1] + ":" + noSign[0]; // return for AM (non-12)
    
    }

    // solved
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
