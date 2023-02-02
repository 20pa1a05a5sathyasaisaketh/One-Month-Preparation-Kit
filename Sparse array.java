import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        HashMap<String,Integer> arr=new HashMap<>();
        for(int i=0;i<n;++i){
            String str=s.next();
            if(arr.get(str)==null){
                arr.put(str,1);
            }
            else{
                int count1=arr.get(str);
                arr.put(str,++count1);
            }
        }
        int a=s.nextInt();
        while(a-->0){
            String str1=s.next();
            if(arr.get(str1)==null){
                System.out.println(0);
            }
            else{
                System.out.println(arr.get(str1));
            }
        }
    }
}
