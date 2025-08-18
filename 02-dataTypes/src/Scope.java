public class Scope {

    public static int b = 5; // global scope

    public static void main(String[] args){
        int x = 5; // local scope

        if (x == 5){
            int y = 10; // block scope, method in local
            System.out.println(y); // can access
        }

        System.out.println(x); // can access
        //System.out.println(y); can not access
    } // scope ended

    public static void someMethod(){
        System.out.println(b); // can be accessed here
    }
}
