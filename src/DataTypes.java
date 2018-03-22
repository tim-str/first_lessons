public class DataTypes {

    public static void main(String[] args) {
        System.out.println("DataTypes");

        // short от -32768 до 32768
        short a = 2;
        short b = 3;
//        short c = a + b;
        short c = (short)(a + b);

        // int
        int a1 = 5;
        int b1 = 4;
//        int c1 = a1 / b1;
        float c1 = (float)(a1 / b1);
        System.out.println(c1);

        // long

        // типы с плавающей точкой
        float a2 = 0.2f;
        float b2 = 0.3f;
        float c2 = a2 * b2;
        System.out.println(c2);

        double a3 = 0.2f;
        double b3 = 0.3f;
        double c3 = a3 * b3;
        System.out.println(c3);

        // char от 0  до 65536
        char char1 = 74;
        char char2 = 'a';
        char char3 = 118;
        char char4 = 97;
        System.out.println("Char: " + char1 + char2 + char3 + char4);
        char char5 = '\u0054';
        System.out.println(char5);

    int a5 = 100; // число
    Integer a6 = 120; // ссылка на объект

//    byte x = Byte.parseByte("100");
    int x1 = Integer.parseInt("100");
    short x2 = Short.parseShort("100");
    long x3 = Long.parseLong("100");
    double x4 = Double.parseDouble("100.9");
    float x5 = Float.parseFloat("100.9");

    System.out.println(x1);

    String str = "STRING";
    String str2 = "STRING";

    String str3 = new String("STRING");
    String str4 = new String("STRING");

    System.out.println(str == str2); // true
    System.out.println(str3 == str4); // false
    System.out.println(str3.equals(str4)); // true











    }

}
