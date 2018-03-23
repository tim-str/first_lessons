public class strings {
    public static void main(String[] args) {
        String str = "String 3434";
        String str1 = "String";

        str1 = "op";
        System.out.println(str1 == str);

        String str2 = new String("String 2");
        String str3 = new String("String 2");

        System.out.println(str2 == str3);

        String st = String.format("шаблон со специальными символами %d%n", 3434);
        System.out.println(st);

        StringBuilder sb = new StringBuilder(); // требует меньше ресурсов
//        StringBuffer sf = new StringBuffer(); требует больше ресурсов, безопасен для работы в многопоточной среде

        sb.append("some new ").append("new");
        sb.insert(3,"INSERT");

        System.out.println(sb);
        String stFromLoop = "";

        long start = System.nanoTime();
        StringBuilder sbLoop = new StringBuilder();
        for (int i = 0; i < 10; i++) {
//            stFromLoop += "number: " + i;
            sbLoop.append("number: ").append(i);
        }


        long end = System.nanoTime();

        System.out.println("Time: " + (start-end)/1000000.0 + "msc");

        start = System.nanoTime();
//        StringBuilder sbLoop = new StringBuilder();

        for (int i = 0; i < 10; i++) {
//            sbLoop.append("number: ").append(i);
            stFromLoop += "number: " + i;
        }
        end = System.nanoTime();
        System.out.println("Time: " + (start-end)/1000000.0 + "msc");

//        System.out.println(stFromLoop);

        str1.equals(str2);
        str1.equalsIgnoreCase(str2);
        str2.startsWith("qwe");
        str2.endsWith("asd");



        str1.compareTo(str2);
        str1.compareToIgnoreCase(str2);
        // 0 - если аргумент лексически равен строке str1
        // < 0 если str2 больше str1
        // > 0 если str1 больше str2

        str.length(); // длина строки









//        compareTo();

//

    }

}
// javap file_name
// javap -c file_name

// StringConcatFactory
