public class Compare {
    public static void main(String[] args){
        int x = 5;
        int y = 5;
        int z = 10;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);

        System.out.println(x > 0 && y < z); // and
        System.out.println(x > 0 || y < z); // or
        System.out.println(!(x > 0)); // not
    }
}
