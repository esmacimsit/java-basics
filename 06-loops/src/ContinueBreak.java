public class ContinueBreak {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                break; // until
            }
            System.out.println(i);
        }

        System.out.println("***");

        for (int i = 1; i <= 10; i++){
            if (i == 5){
                continue; // skip
            }
            System.out.println(i);
        }

        System.out.println("***");

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                continue; // print odd ones
            }
            System.out.println(i);
        }

        System.out.println("***");




    }
}
