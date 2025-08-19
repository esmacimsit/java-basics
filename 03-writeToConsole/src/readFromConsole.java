import java.util.Scanner;

public class readFromConsole {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // create scanner object

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // read string
        System.out.println("Hello, " + name); // next line

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // read int
        System.out.printf("You are %d years old", age);

        System.out.println();
        System.out.print("Enter the num: ");
        double num = input.nextDouble(); // read double
        System.out.printf("You entered %.2f", num); // 2 digita
    }
}

