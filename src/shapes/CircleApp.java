package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        int count = 1;

        System.out.println("Enter the radius of the circle: ");
        double radius = input.getDouble();

        Circle circle = new Circle(radius);

        System.out.printf("The area of the circle is: %.2f%n", circle.getArea());
        System.out.printf("The circumference of the circle is: %.2f%n", circle.getCircumference());
        System.out.println();
        System.out.printf("You have created %s circle(s)%n", count);
        System.out.println();
        System.out.println("Want to make another?");
        boolean moreCircles = input.yesNo();
        do {
            System.out.println("Enter the Radius of the circle: ");
            radius = input.getDouble();
            circle = new Circle(radius);
            System.out.printf("The area of the circle is: %.2f%n", circle.getArea());
            System.out.printf("The circumference of the circle is: %.2f%n", circle.getCircumference());
            System.out.println();
            System.out.printf("You have created %s circle(s)%n", count);
            System.out.println("Want to make another circle?");
            moreCircles = input.yesNo();
        } while (moreCircles);
    }
}
