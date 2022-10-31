import java.util.Scanner;

public class Sorting {

    static public void sorting() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println();

        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            System.out.println(str1 + " - max, length = " + str1.length());
            if (str2.length() > str3.length()) {
                System.out.println(str2 + " - average, length " + str2.length());
                System.out.println(str3 + " - min, length = " + str3.length());
            } else {
                System.out.println(str3 + " - average, length " + str3.length());
                System.out.println(str2 + " - min, length = " + str2.length());

            }
        } else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            System.out.println(str2 + " - max, length = " + str2.length());
            if (str1.length() > str3.length()) {
                System.out.println(str1 + " average, length " + str1.length());
                System.out.println(str3 + " - min, length = " + str3.length());

            } else {
                System.out.println(str3 + " average, length " + str3.length());
                System.out.println(str1 + " - min, length = " + str1.length());

            }
        } else {
            System.out.println(str3 + " - max, length = " + str3.length());
            if (str2.length() > str1.length()) {
                System.out.println(str1 + " - min, length = " + str1.length());
                System.out.println(str2 + " средняя, длина " + str2.length());
            } else {
                System.out.println(str2 + " - min, length = " + str2.length());
                System.out.println(str1 + " средняя, длина " + str1.length());

            }
        }
    }
}
