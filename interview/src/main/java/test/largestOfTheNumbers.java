package test;

import java.util.Scanner;

public class largestOfTheNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter the Third Number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is the Largest number " + a);
        } else if (b>a && b>c){
            System.out.println("B is the largest number "+ b);
        } else {
            System.out.println("C is the largest number  "+ c);
        }



       }
}
