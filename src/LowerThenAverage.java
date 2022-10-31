import java.util.Scanner;

public class LowerThenAverage {

    static public void lowerThanAverage() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println();

        int averageLength = (str1.length() + str2.length() + str3.length()) / 3;
        if (str1.length() < averageLength){
            System.out.println(str1 + " "+ str1.length());
        }
        if (str2.length() < averageLength){
            System.out.println(str2 + " "+ str2.length());
        }
        if (str3.length() < averageLength){
            System.out.println(str3 + " "+ str3.length());
        }


    }
}
