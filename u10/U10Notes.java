package u10;

import java.util.ArrayList;

public class U10Notes {
    public static void main(String[] args) {
        int sz = 123;
        Object[] arr = new Object[sz];
        // doubling the size
        Object[] temp = new Object[sz * 2];
        for (int i = 0; i < arr.length; i++) {
           temp[i] = arr[i]; 
        }
        arr = temp;

        ArrayList<String> names;
        
    }    

    // returns an arraylist with the words from another arraylist
    // that have 5 or more letters in them
    public static ArrayList<String> fiveOrLonger(ArrayList<String> words) {
       ArrayList<String> w5 = new ArrayList<String>(); 
    }
}
