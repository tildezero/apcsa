package u11;

public class ProgrammingExamples {
    public static void main(String[] args) {
    }    

    public static String removeDashesInSSN(String ssn) {
        return ssn.substring(0, 3) + ssn.substring(4, 6) + ssn.substring(7);
    }

    public static String changeDateStr(String s) {
        return s.substring(3, 5) + "-" + s.substring(0, 2) + "-" + s.substring(6);
    }

    public static String convertName(String name) {
        int comma = name.indexOf(",");
        return name.substring(comma + 2) + " " + name.substring(0, comma);
    }

    public static String invert(String s) {
        int size = s.length();
        String r = "";
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '1') {
                r += '0';
            } else if (s.charAt(i) == '0') {
                r += '1';
            } else {
                r += ' ';
            }
        }

        return r;
    }

    public static String findNote(String note) {
        int op = note.indexOf("(");
        int lp = note.lastIndexOf(")");
        if (op == -1 || lp == -1 || lp < op) {
            return note;
        }
        return note.substring(op, lp);
    }

    public static boolean hasMatch(String s, String p) {
        return s.indexOf(p) != -1;
    }

    public static boolean allSameChars(String s) {
        char fs = s.charAt(0);
        int sz = s.length();
        for (int i = 1; i < sz; i++) {
            if (s.charAt(i) != fs) {
                return false;
            }
        }

        return true;
    }

    public static boolean allDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isDigit(s.charAt(i)))) {
                return false;
            }
        }

        return true;
    }


}
