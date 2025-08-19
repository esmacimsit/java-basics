public class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = b / a;
        int g = 102 % a; // 2
        System.out.println(c);
        System.out.println(e);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);

        a += 3;
        System.out.println(a);

        b /= 2;
        System.out.println(b);

        String name = "Buket";
        name += " Esma";
        System.out.println(name);
    }
}