import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        int[] integers = new int[5]; // len
        System.out.println("Array of integer elements: " + Arrays.toString(integers));

        double[] doubles = new double[2]; // fixed size
        System.out.println("Array of doubles: " + Arrays.toString(doubles));

        boolean[] bools = new boolean[2];
        System.out.println("Array of bools: " + Arrays.toString(bools)); // falses

        String[] strings = new String[2];
        System.out.println("Array of strings: " + Arrays.toString(strings)); // nulls

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("First element is: " + numbers[0]);

        numbers[0] = 6;

        System.out.println("First element now is: " + numbers[0]);
    }
}
