package test;

import java.util.Arrays;

public class arraySearchBinary {
    public static void main(String[] args) {
        
        int a[] = { 1,2,3,4,5,6,7,8,9,10}; // should be in sorted order

        int key=10;

        int l = 0;

        boolean flag = false;

        int h =a.length-1;

        while(l<=h){
            int m=l+h/2;
            if(a[m]==key){
                System.out.println("element Found..");
                flag=true;
                break;
            }
            if(a[m]<key){
                l=m+1;
            }
            if (a[m]>key){
                h=m-1;
            }
        }
        if(flag==false){
            System.out.println("element not found");
        }

        // Arrays.binarySearch();
        System.out.println(Arrays.binarySearch(a, 10));
    }
}
