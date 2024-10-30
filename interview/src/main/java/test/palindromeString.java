package test;

import java.util.Scanner;

public class palindromeString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();

        String rev = "" ;
        int len = str.length();
        String org_str = str;

        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
            }
            System.out.println("Reverse of a String is : " + rev);

            if(org_str.toLowerCase().equals(rev.toLowerCase())){
                System.out.println("This is a Palindrome String: " + rev);
            }else{
                System.out.println("This is not a Palindrome String: " + rev);
            }

   }
}
