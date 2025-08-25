public class StringConcat {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        String myName = "John";

        System.out.println(fullName);

        System.out.println(System.identityHashCode(firstName));
        System.out.println(System.identityHashCode(lastName));
        System.out.println(System.identityHashCode(fullName));
        // all different
        System.out.println(System.identityHashCode(myName)); // same with firstName (interning)

        int a = 5;
        int b = 10;
        String result1 = "The sum of " + a + " and " + b + " is " + a + b;
        String result2 = "The sum of " + a + " and " + b + " is " + (a + b);

        System.out.println(result1); // 510
        System.out.println(result2); // 15

        String str = " ";
        str += "hello";
        System.out.println(System.identityHashCode(str));
        str += " ";
        System.out.println(System.identityHashCode(str));
        str += "world";
        System.out.println(System.identityHashCode(str));
        // all different low performance

        StringBuilder strBuild = new StringBuilder(); // mutable, uses same object
        strBuild.append("hello");
        System.out.println(System.identityHashCode(strBuild));
        strBuild.append(" ");
        System.out.println(System.identityHashCode(strBuild));
        strBuild.append("world");
        System.out.println(System.identityHashCode(strBuild));
        // modification without creating new object and unsynchronized
        System.out.println(strBuild);

        StringBuffer strBuff = new StringBuffer(); // mutable, multi thread
        strBuff.append("hello");
        System.out.println(System.identityHashCode(strBuild));
        strBuff.append(" ");
        System.out.println(System.identityHashCode(strBuild));
        strBuff.append("world");
        System.out.println(System.identityHashCode(strBuild));
        // modification without creating new object and thread safe









    }
}
