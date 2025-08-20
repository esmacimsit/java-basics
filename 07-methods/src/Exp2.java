public class Exp2 {

    public static void main(String[] args){
        int sum = addNumbers(3, 4);

        System.out.println(sum);

        printHello();
        printHelloWithName("Buket");
    }

    public static int addNumbers(int a, int b){
        return a + b;
    }

    public static void printHello(){ // no parm
        System.out.println("Hello");
    }

    public static void printHelloWithName(String name){ // w parm
        System.out.println("Hello " + name + "!");
    }



}
