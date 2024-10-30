package test;

public class factorialofaNumber {
    
    public static void main(String[] args) {
        
        int num = 10;
        long factorial = 1;

        for(int i=1;i<=num;i++){

            factorial = factorial * i;
        }
        System.out.println("Factorial of the Given Number is " + factorial);
    }

}
