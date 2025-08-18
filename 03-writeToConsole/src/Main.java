public class Main{
    public static void main(String[] args){
        System.out.println(args); // adress
        System.out.println("hello");
        System.out.println("java"); // next line

        System.out.print("hello");
        System.out.print("java"); // stay in line

        boolean isTrue = true;
        System.out.println(isTrue);

        String name = "esma"; // %s
        int age = 21; // %d
        System.out.printf("my name is %s im %d years old", name, age); // using placeholder

        double price = 12.48973; // %f
        System.out.printf(" total is %.2f", price); // 2 decimal
    }
}