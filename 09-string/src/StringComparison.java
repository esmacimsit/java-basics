public class StringComparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hi";

        if (str1.equalsIgnoreCase(str2)){ // no case sensitivity
            System.out.println("both are equal");
        } else{
            System.out.println("both are not equal");
        }

        if (str1 == str2){
            System.out.println("both are equal");
        } else{
            System.out.println("both are not equal");
        }

        if (str1.compareTo(str2) == 0) {
            System.out.println("equal");
        } else if (str1.compareTo(str2) > 0){
            System.out.println("first one is greater");
        } else{ // str1.compareTo(str2) < 0
            System.out.println("first one is smaller");
        }
        // compare unicodes until different letter came, uppercases < lowercases, A-Z ... a-z





    }
}
