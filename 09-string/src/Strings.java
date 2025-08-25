public class Strings {
    public static void main(String[] args) {
        String name = "John Doe";
        int length = name.length();

        System.out.println(length); // count space and chars

        String str1 = "hello"; // stored in constant pool
        String str2 = "hello"; // also in pool
        String str3 = new String("hello"); // stored in heap
        String str4 = new String("hello"); // also in heap

        System.out.println(str1 == str2); // true
        System.out.println(str3 == str4); // false

        System.out.println(System.identityHashCode(str1)); // same with two
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}