package u10;

import java.util.ArrayList;

@SuppressWarnings("all")
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

        // capitalized wrapper class
        ArrayList<Double> samples = new ArrayList<Double>();
        // wrapper class making
        Double d = new Double(0.5);
        samples.add(d);
        // autoboxing (primitive -> wrapper)
        samples.add(3.14);
        // autoboxing and typecasting (primitive int -> double -> wrapped double)
        samples.add((double) 4);

        
    }    

    // returns an arraylist with the words from another arraylist
    // that have 5 or more letters in them
    public static ArrayList<String> fiveOrLonger(ArrayList<String> words) {
       ArrayList<String> w5 = new ArrayList<String>();
       for (String s: words) {
           if (s.length() >= 5) w5.add(s);
       }
       return w5;
    }
}
