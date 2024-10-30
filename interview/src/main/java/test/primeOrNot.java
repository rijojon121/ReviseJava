package test;

public class primeOrNot {
    
    public static void main(String[] args) {
        
        int num = 27;
        int count = 0;

        if(num>1) 
        { 
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
                if(count == 2){
                    System.out.println("This is a Prime Number");
                } else {
                    System.out.println("This is not a Prime Number");
                }
            
        } else {
            System.out.println("This Number is not a Prime Number");
        }
        
    }
    }
