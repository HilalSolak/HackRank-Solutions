import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.text.DecimalFormat;
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
       int i;
       double positive=0;
       double negative=0;
       double notral=0;
       int n=arr.size();
       for(i=0;i<arr.size();i++){
           if(arr.get(i)<0){
               negative++;
           }
           if(arr.get(i)==0){
               notral++;
           }
           if(arr.get(i)>0){
               positive++; 
           } 
       }
       
       
       
       System.out.printf("%.6f\n",positive/n);
       System.out.printf("%.6f\n",negative/n);
       System.out.printf("%.6f\n",notral/n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
