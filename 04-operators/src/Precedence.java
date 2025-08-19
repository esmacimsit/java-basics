public class Precedence {
    public static void main(String[] args){
        int a = 2 + 3 * 4;
        System.out.println(a); // 14

        int b = (2 + 3) * 4;
        System.out.println(b); // 20

        int c = -2 * 3;
        System.out.println(c); // -6

        int d = 2 + 3 - 4;
        System.out.println(d); // 1
        //common pitfall
        int x = 5;
        int y = 10;

        System.out.println(x == y); // false
        System.out.println(x = y); // 10
    }
}
