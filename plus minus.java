import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int pCount = 0, nCount = 0,zeroCount = 0;
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i]<0){
                nCount++;
            }else if(arr[i]>0){
                pCount++;
            }else if(arr[i]==0){
                zeroCount++;
            }
        }
        float a=0f,b=0f,c=0f;
        a = (float)pCount/n;
        b = (float)nCount/n;
        c = (float)zeroCount/n;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
