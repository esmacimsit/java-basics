public class StringPool {
    public static void main(String[] args) {
        // special place in heap to hold string literals
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); // true

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4); // false
    }
}
