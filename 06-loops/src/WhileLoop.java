import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = -1; // to start loop

        while (age < 0){
            System.out.println("Enter your age: ");
            age = input.nextInt();

            if (age < 0){
                System.out.println("Invalid age.");
            }
        }
    }
}
