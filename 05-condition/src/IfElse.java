public class IfElse {
    public static void main(String[] args){
        int x = 5;
        int y = 10;

        if(x > 10){
            System.out.println("x greater");
        } else{
            System.out.println("x not greater");
        }

        int num = 5;

        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }

        // nested loop

        int age = 25;

        if (age >= 18){
            if (age >= 21){
                System.out.println("You can drink.");
            } else{
                System.out.println("You can vote but not drink.");
            }
        } else{
            System.out.println("You are a child.");
        }

        if (x > y){
            System.out.println("x greater");
        } else if (x < y){
            System.out.println("y greater");
        } else{
            System.out.println("equal");
        }




    }
}
