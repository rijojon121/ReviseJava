package test;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum =0;

        while(num>0){

            sum = sum+num%10;
            num = num/10;
        }
        System.out.println("Sum of the digits in the number is " + sum);
        
    }
}
