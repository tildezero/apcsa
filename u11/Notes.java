package u11;

@SuppressWarnings("all")
public class Notes {
    public static void main(String[] args) {
        // String literals
        String city = "boston";
        // an empty string
        String empty_string = "";
        // escape sequences
        String pathname = "C:\\Ch10\\funny.txt"; // "C:\Ch10\funny.txt"
        String closing = "\nThanks,\n Suhas";
        /* 
            Thanks,
            Suhas
        */

        // String st = "blabla" == 
        String st = new String("blabla"); // no need to do this
        // empty string constructor
        String e_st = new String();
        
        // immutability
        String str = "Hello";
        char[] notAStr = {'H', 'e', 'l', 'l', 'o'};

        // you cannot str[0] = "y"
        // but you can do 
        notAStr[0] = 'y';

        // equivalent of above but w/ a string
        str = "Y" + str.substring(1); // this is building a new string
        
        //----------------------------------------------------------------------------------

        // String methods
        "Hello".length(); // length of the string
        "\nLove, \nMr. Irwin".length(); // this has a length of 17 (spaces = char, escape sequence = 1 char)

        String ine = "Internet";
        // get char from string
        // THIS IS NOT ON AP EXAM ANYMORE, USE STRING BASED METHODS INSTEAD
        char c1 = ine.charAt(0);
        char c2 = ine.charAt(1); 

        // string alternative to charAt, cuts out part of a string and returns it
        String cs1 = ine.substring(0, 1); // substr from character 0 to character 1 (not inclusive)
        String cs2 = ine.substring(1, 2);
        String allexceptone = ine.substring(1); // 1 to length

        // "Internet".substring(-1) -> StringIndexOutOfBoundsException

        "A".compareTo("B"); // this is a positive number because b is above a in letters
        "B".compareTo("A"); // this is a negative number because a is below b in letters

        // walmart replace
        String ilstr = "in.law";
        int ili = ilstr.indexOf(".");
        String before = ilstr.substring(0, 1);
        String after = ilstr.substring(ili + 1);
        ilstr = before + "-" + after; // ilstr = "in-law"

        // multi replace
        String phone = "1.800.123.4567";
        int pit;
        while ((pit = phone.indexOf(".")) != -1) {
            String pbf = phone.substring(0, pit);
            String paf = phone.substring(pit + 1);
            phone = pbf + "-" + paf;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (phone.substring(i, i + 1).equals(".")) {
                // do something
            }
        }

    }
}
