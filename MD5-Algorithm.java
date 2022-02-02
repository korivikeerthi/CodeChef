import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

    public static String getMD5(String s){
        try{
            // we have used MD5 algorithm
            MessageDigest md = MessageDigest.getInstance("MD5");
           // digest() method is called to get the digest of the input string and it returns  a byte array 
        byte[] digest =  md.digest(s.getBytes());
        //BigInteger is used to convert byte array into signum representation
        BigInteger num = new BigInteger(1,digest);
        // convert the byte [] into hex values
        String hashtext = num.toString(16);
        return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String hashvalue = getMD5(sc.next());
        System.out.println(hashvalue);
    
    }
}