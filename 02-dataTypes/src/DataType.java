// class (non pri)
public class DataType {
    public static void main(String[] args){
        //PRIMITIVE DATA TYPES, stored in stack (fixed size), have a value

        // ints
        byte age = 25;                 // whole num range: -128 to 127
        short year = 2024;             // whole num range: -32,768 to 32,767
        int population = 1_000_000;    // whole num range: -2,147,483,648 to 2,147,483,647
        long distance = 1_000_000_000L; // whole num range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // floats
        float pi = 3.14f;              // ~6-7 decimal digits
        double e = 2.718281828459045;  // ~15-16 decimal digits

        // char
        char letter = 'A';             // single 16-bit unicode (0 to 65,535)
        char c = 65;                   // A in unicode

        // bool
        boolean isJavaFun = true;      // stores true or false

        //NON PRIMITVE DATA TYPES, stored in heap (variable size), have refer to an object

        // string
        String myString = "Hello, World";

        // array
        int[] myArray = new int[] {1, 2, 3, 4, 5};
        }
    }