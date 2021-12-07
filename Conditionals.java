public class Conditionals {
    public static void main(String[] args) {
       if (whichCSTeacher("irwin")) {
           System.out.println("good");
       } else {
           System.out.println("bad");
       }
    }
    private static boolean whichCSTeacher(String teacher) {
        if (teacher.equals("Irwin")) return true;
        else return false; 
    }
}