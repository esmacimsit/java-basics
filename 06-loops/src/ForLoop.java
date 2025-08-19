public class ForLoop {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 5 to 15 in increments of 2
        for (int i = 5; i <= 15; i += 2){
            System.out.println(i);
        }

        // 10 to 1
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        // factorial of given
        int num = 5;
        int factorial = 1;

        for (int i = 1; i <= num; i++){
            factorial *= i;
        }

        System.out.println("the factorial of " + num + " is " + factorial);




    }
}
