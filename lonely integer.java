import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Lonely {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        boolean cond;
        int x=0;
        for ( int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cond = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    j = i; 
                    cond = false;
                }
            }
        if (cond == true) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    j = n; 
                    cond = false;
                }
            }
        if (cond == true) {
          x = i;        
          i = n;         
        }
      }
    }
    
    
    System.out.println(arr[x]);
  }
}
