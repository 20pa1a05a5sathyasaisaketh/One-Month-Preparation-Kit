import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangram{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        String upper=n.toUpperCase();
        upper=upper.replace(" ","");
        Set<Character> pan=new HashSet<Character>();
        for(int i=0;i<upper.length();i++){
            pan.add(upper.charAt(i));
        }
        if(pan.size()==26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
