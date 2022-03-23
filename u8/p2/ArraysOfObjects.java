package u8.p2;

public class ArraysOfObjects {

    public static void main(String[] args) {
        Circle[] circleArray = new Circle[10];

        circleArray[0] = new Circle();
        circleArray[1] = new Circle();
        circleArray[2] = new Circle(5);
        circleArray[5] = new Circle(3);
        circleArray[4] = new Circle(7);

        Circle sc = new Circle(10);
        circleArray[3] = sc;

        Circle oc = new Circle(8);
        circleArray[6] = oc;
        circleArray[7] = oc;
        circleArray[8] = circleArray[6];

        double a1 = sc.getArea();
        System.out.println("area 1 is " + a1);

        double a2 = circleArray[3].getArea();
        System.out.println("area 2 is " + a2);

        oc.setRadius(4);
        System.out.printf("ca6 rad: %f\nca7 rad: %f\nca8 rad: %f\n", circleArray[6].getRadius(), circleArray[7].getRadius(), circleArray[8].getRadius());

        Circle tr = circleArray[8];
        tr.setRadius(15);
        System.out.printf("ca6 rad: %f\nca7 rad: %f\nca8 rad: %f\n", circleArray[6].getRadius(), circleArray[7].getRadius(), circleArray[8].getRadius());

        // getting val of array[9] = null ptr exception
    }
}
