import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] sq = new int[n];
        for(int i=0; i < n; i++){
            sq[i] = s.nextInt();
        }
        int a = s.nextInt();
        int b = s.nextInt();
        // your code goes here
        if(b>n){
            System.out.println(0);
            return;
        }
        int count = 0;
        int sum = 0;
        for(int i=0; i<b-1; i++){
            sum+=sq[i];
        }
        for(int j=b-1; j<n; j++){
            sum -= (j-b)<0 ? 0 : sq[j-b];
            sum += sq[j];
            if(sum==a)
                count++;
        }
        System.out.println(count);
    }
}
