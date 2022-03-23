package u8.p2;

public class NotObjects {
    public static void main(String[] args) {
        Object o1 = "hello world";

        Object[] arr = new Object[5];

        arr[0] = "Hello";
       
        printObj(o1);

    }

    public static void printObj(Object o) {
        if (o != null) {
            System.out.println("o is " + o.toString());
        }
    }
}
