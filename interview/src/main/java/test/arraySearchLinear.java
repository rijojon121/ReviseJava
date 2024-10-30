package test;

public class arraySearchLinear {
    public static void main(String[] args) {
        
        int a[] = {10,20,30,40,50,90,100};

        int search_elem =30;
        boolean flag = false;

        for(int i=0;i<a.length;i++){
           // System.out.println(a[i]);
           if(search_elem == a[i]){
            System.out.println("Element Found at : " + i);
            flag=true;
            break;
           }
        }
        if(flag==false){
            System.out.println("element not found");
        }
    }
}
