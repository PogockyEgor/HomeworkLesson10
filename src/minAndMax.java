import java.util.Arrays;
import java.util.Scanner;

public class minAndMax {

    static public void minAndMax() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            System.out.println(str1 + " - max, lenght = "+str1.length());
            if (str2.length() > str3.length()) {
                System.out.println(str3 + " - min, lenght = "+str3.length());
            } else {
                System.out.println(str2 + " - min, lenght = "+str2.length());
            }
        } else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            System.out.println(str2 + " - max, lenght = "+str2.length());
            if (str1.length() > str3.length()) {
                System.out.println(str3 + " - min, lenght = "+str3.length());
            } else {
                System.out.println(str1 + " - min, lenght = "+str1.length());
            }
        } else {
            System.out.println(str3 + " - max, lenght = "+str3.length());
            if (str2.length() > str1.length()) {
                System.out.println(str1 + " - min, lenght = "+str1.length());
            } else {
                System.out.println(str2 + " - min, lenght = "+str2.length());
            }
        }
    }
}
