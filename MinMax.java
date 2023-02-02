import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMax {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long arr[] = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextLong();
        }
        long minVal = 0, maxVal = 0;
        for (int j = 0; j < 5; j++) {
            long minf = sumOfNumbers(j, arr);
            long maxf = sumOfNumbers(j, arr);
            if (j == 0) {
                minVal = minf;
                maxVal = maxf;
            }
            if (minf < minVal) {
                minVal = minf;
            }
            if (maxf > maxVal) {
                maxVal = maxf;
            }
        }
        System.out.println(minVal + " " + maxVal);
    }

    static long sumOfNumbers(int a, long[] arr) {
        long sum = 0;
        for (int j = 0; j < 5; j++) {
            if (a != j) {
                sum += arr[j];
            }
        }
        return sum;
    }
     
}
