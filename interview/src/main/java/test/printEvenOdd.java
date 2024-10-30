package test;

public class printEvenOdd {
    public static void main(String[] args) {
        
        int a[] = { 2,3,4,5,6,7,8,9};

        System.out.println("Even numbers are as:  ");
        // for(int i=0; i<a.length;i++){
        //     if(a[i]%2==0){
        //         System.out.println(a[i]);
        //     }
        // }

        for(int value:a){
            if(value%2==0){
                System.out.println(value);
            }
        }
         System.out.println("Odd numbers are as:  ");
         for(int value:a){
            if(value%2!=0){
                System.out.println(value);
            }
        }
    //     for(int i=0; i<a.length;i++){
    //         if(a[i]%2!=0){
    //             System.out.println(a[i]);
    //         }
    // }
    }
}
