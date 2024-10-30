package test;

import java.util.Scanner;

public class palindromeNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int rev= 0;
        int org_num = num;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse of the number is : " + rev);

        if(org_num==rev) {
            System.out.println("This is a Palindrome number ");
        } else {
            System.out.println("This is not a Palindrome Number ");
        }
    }
}
