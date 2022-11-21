import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
  int length=s.length();
  String AmPm=s.substring((length-2));
  String hour=s.substring(0,2);
  int H= Integer.parseInt(hour);
  String result;
  if(AmPm.equalsIgnoreCase("PM")){
     if(H==12){
          result=12+s.substring(2,(length-2));
      }else 
          result=H+12+s.substring(2,(length-2));
      }
   else{
      if(H==12){
        result="00"+s.substring(2,(length-2));
        }else{ 
        result=s.substring(0,(length-2));
          }
   }

 return result;
    }

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
