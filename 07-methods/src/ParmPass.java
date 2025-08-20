public class ParmPass {
    // pass by value
    public static void main(String[] args){
        int x = 10;
        System.out.println("Before calling the method, x =" + x);
        changeValue(x);
        System.out.println("After calling the method, x = " + x);
    }

    public static void changeValue(int num){ // add 10
        num = num + 10;
        System.out.println("Inside the method, num = " + num);
    }

}