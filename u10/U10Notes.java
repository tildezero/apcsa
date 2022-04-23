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

        int normalArr[] = new int[5];
        // arr[5]; // arrayindexoutofboundserror

        ArrayList<Integer> arl = new ArrayList<>();
        arl.get(5); // indexoutofboundserror

        ArrayList<String>[] mls = new ArrayList[5];
        mls[2].add("yeah"); // one method 
        for (ArrayList a: mls) {
            System.out.println(a.toString());
        }

        ArrayList<Object> oal = new ArrayList<>();
        oal.get(5).toString(); // method chaining
        

        // arraylist pitfalls

        // for loops are not always the best option for ArrayLists

        ArrayList<String> sentence = new ArrayList<>();
        int n = sentence.size();
        for (int i = 0; i < n; i++) 
            if ("like".equals(sentence.get(i)))
                sentence.remove(i);
        
        // BAD: incrementing i, but the elements are shifted back, because sentence.size is dynamic
        for (int i = 0; i < sentence.size(); i++) 
            if ("like".equals(sentence.get(i))) sentence.remove(i);
        
        // instead use while
        int i = 0;
        while (i < sentence.size()) {
            if ("like".equals(sentence.get(i))) sentence.remove(i);
            else i++;
        } 
        
        Object obj2 = new Object();
        Object obj1 = new Object();
        obj1.equals(obj2); // checks if obj1 == obj2

        String[] na = {"bob", "bob2", "bob3"};
        ArrayList<Person> guests = makeGuestList(na);
        
    }    

    // perosn has an instance variable called name
    // v1
    public static ArrayList<Person> makeGuestList(String[] names) {
        ArrayList<Person> list = new ArrayList<>();
        for (String n: names) {
            list.add(new Person(n));
        }
        return list;
    }

    // v2
    public static ArrayList<Person> makeGuestListTwo(String[] names) {
       ArrayList<Person> ns = new ArrayList<>(); 
       Person p = new Person();
       for (int i = 0; i < names.length; i++) {
            p.setName(names[i]);
            ns.add(p);
       }
       return ns;
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

class Person {
    public Person() {
    }

    public Person(String n) {
    }

    public void setName(String n) {
    }
}