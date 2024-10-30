package test;

import java.util.HashSet;

public class arrayDuplicatesInarray {
    public static void main(String[] args) {
        
        String arr[] = {"java", "C#", "python"};

        HashSet <String>langs = new HashSet();

        boolean flag =false;

        for( String l:arr){
            if(langs.add(l)==false){
                System.out.println("Duplicate element found : " + l);
                flag=true;
            }
        }

        if(flag==false){
            System.out.println("No Duplicate Element");
        }

    }
}
