public class ParmPass2 {
    // pass by refer like pass by value
    // java is pass by value only
    public static void main(String[] args){
        int[] numbers = {1, 2, 3};
        System.out.println("Before method, numbers[0] = " + numbers[0]);
        changeArray(numbers);
        System.out.println("After method, numbers[0] = " + numbers[0]);
    }

    public static void changeArray(int[] array){
        array[0] = array[0] + 10;
        System.out.println("Inside the method, array[0] = " + array[0]);
    }
}
