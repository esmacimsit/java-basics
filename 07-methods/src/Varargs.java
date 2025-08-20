public class Varargs {
    public static void main(String[] args){
        printNums();
        printNums(5);
        printNums(1, 2, 3, 4, 5);
    }

    public static void printNums(int... nums){ // varargs
        for (int num : nums){
            System.out.println(num);
        }
    }
}
