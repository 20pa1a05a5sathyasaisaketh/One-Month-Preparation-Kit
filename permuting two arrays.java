import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Permuting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int[] a = new int[x];
            int[] b = new int[x];
            for (int i = 0; i < x; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < x; i++) {
                b[i] = s.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            solve(a, b, y);
        }
    }

    private static void solve(int[] a, int[] b, int y) {
        for(int i=0, j=a.length-1; i<a.length; i++, j--){
            if(a[i]+b[j] < y) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
