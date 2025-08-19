import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        // run at least once
        do{
            System.out.printf("Enter a positive number: ");
            num = input.nextInt();
        } while (num <= 0);

        System.out.printf("Thank you");
    }
}