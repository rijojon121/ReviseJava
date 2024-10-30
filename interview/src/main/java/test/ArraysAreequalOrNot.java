package test;

import java.io.ObjectInputFilter.Status;
import java.util.Arrays;

import apple.laf.JRSUIConstants.State;

public class ArraysAreequalOrNot {
    
    public static void main(String[] args) {
        
        int a1[] ={2,3,4,5,6,7,8,9};
        int a2[] ={2,3,4,5,6,7,8,9,10};

       Boolean status =  Arrays.equals(a1, a2);

       if(status == true){
        System.out.println("Arrays are Equal");
    } else {
           System.out.println("Arrays are not Equal");
       }

    }
}
