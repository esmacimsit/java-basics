import java.util.Arrays;

public class Exp2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7, 6};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println("number = " + number); // soutv
        }

        System.out.println("Length of array is: " + numbers.length);
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int searchKey = 4; // search for index of 4
        int index = Arrays.binarySearch(numbers, searchKey);

        if (index >= 0) {
            System.out.println("The element " + searchKey + " is found at index " + index);
        } else{
            System.out.println("The element " + searchKey + " is not found in array");
        }

        
    }

}