public class StringObject {
    public static void main(String[] args) {
        String str = " hello java";

        int length = str.length();
        System.out.println("length of string is: " + str);

        char firstLetter = str.charAt(0); // char at 0 index
        System.out.println("first letter of string is: " + firstLetter); // space is a char

        int index = str.indexOf('a');
        System.out.println("first a is at index: " + index); // 7

        System.out.println(System.identityHashCode(str)); // 149...

        str = str + " world"; // str is immutable so it cant actually concat but creates a new object

        System.out.println(System.identityHashCode(str)); // 168... new object
    }
}