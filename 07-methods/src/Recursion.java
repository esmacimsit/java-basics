public class Recursion {
    public static void main(String[] args){
        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5 is: " + factorialOf5);
    }

    public static int factorial(int n){ // recursion
        if (n == 0){ // base case
            return 1; // 0! = 1
        } else{
            return n * factorial(n - 1); // 5 * 4... 1 * 0, 1 (base)
        }
    }



}
