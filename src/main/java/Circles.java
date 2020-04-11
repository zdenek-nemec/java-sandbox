public class Circles {
    public static double getCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(getCircleArea(42));
    }
}
