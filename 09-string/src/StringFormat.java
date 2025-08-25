public class StringFormat {
    public static void main(String[] args) {
        String name = "Andrii";
        int age = 27;
        String result = String.format("My name is %s and im %d years old", name, age);
        System.out.println(result);

        float price = 12.5f;
        System.out.println(String.format("price is: $%.2f", price));
    }
}
