public class DataTypes {
//    Integer Number datatypes in Java
    private short shortMin = -32768;
    private short ShortMax = 32767;
    private int intMin = -2147483648;
    private int intMax = 2147483647;
    private long longMin = -9223372036854775808L;
    private long longMax = 9223372036854775807L;
    private float floatMin = 1.40239846e-45F;
    private float floatMax = 3.4028235E38F;
    private double doubleMin = 4.94065645841246544e-324;
    private double doubleMax = 1.79769313486231570e+308;
    private boolean val1 = true;
    private boolean val2 = false;

    public void typesWithExample() {
        System.out.println("Integers: The integer datatype is used to store numbers without any decimal point.");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("This includes: short, int, and long");
        System.out.println("The short datatype stores 16-bit non-decimal data and " +
                "it's range is from -32768 to 32767");
        System.out.println("The int datatype stores 32-bit non-decimal data and " +
                "it's range is from -2147483648 to 2147483647");
        System.out.println("Long is used to store 64-bit signed non-decimal data and " +
                "we write l or L as show above in the example at the end on the number while declearing a long " +
                "datatype and it's range is from -9223372036854775808 to 9223372036854775807");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Float: represents the 16-bits decimal numbers and" +
                "we write f or F at the end while declaring a float" +
                "it's range is from 1.40239846e-45 to 3.4028235E38");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Double: represents the 32-bits decimal numbers and" +
                "it's range is from 4.94065645841246544e-324 to 1.79769313486231570e+308");
    }

//    type casting: converting one datatype to another
/*
    Implicit: done automatically by the compiler, no data loss occurs
    (short -> int -> long -> float -> double)

    Explicit: done by the developer, there are chances of data loss
    (double -> float -> long -> int -> short)
*/
}
