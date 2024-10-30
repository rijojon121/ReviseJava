package test;

public class arrayMaxMin {
    
    public static void main(String[] args) {
       // int a[] = {20,30,40,60,90,10};

    // int max = a[0];

    // for(int i=1;i<a.length;i++){
    //     if(a[i]>max){
    //         max = a[i];
    //     }
    // }
    // System.out.println("max value i array : " + max);
    int a[] = {50,100,10,20,60};
    int min = a[0];
    
    for(int i=1;i<a.length;i++){
        if(a[i]<min){
            min = a[i];
        }
    }
    System.out.println("min value i array : " + min);
    }
}
