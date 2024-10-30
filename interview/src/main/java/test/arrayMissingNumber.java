package test;

public class arrayMissingNumber {
    public static void main(String[] args) {
        
         int a[] = {1,2,3,5,6,7,8,9};

         int sum1 = 0;
         int sum2=0;

         for(int i=0;i<a.length;i++){
            sum1 = sum1+a[i];
         }
         System.out.println("sum of given numbers is : "+ sum1);
         
         for(int i=1;i<=9;i++){
             sum2 = sum2+i;   
            }
            System.out.println("sum of given numbers is : "+ sum2);
            System.out.println("missing number is : "+ (sum2-sum1));

    }
}
