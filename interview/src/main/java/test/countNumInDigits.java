package test;

import java.util.Scanner;

public class countNumInDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String numStr = sc.next();
        int count = numStr.length();
        System.out.println("Number of digits in this n Number is : " + count );

     
    }

}
