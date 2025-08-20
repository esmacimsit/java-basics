public class Main{
    public static void main(String[] args){
        double radius = 3;
        double circleArea = calcCircleArea(radius);
        printMessage(circleArea);
    }
    // func for java
    public static double calcCircleArea(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void printMessage(double message){
        System.out.println(message);
    }
}
