public class Circles {
    public static double get_circle_area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Circle area is " + get_circle_area(42));
    }
}
