import java.util.Scanner;

public class DiffChar {

    public static void diffChar() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");
        String[] words3 = str3.split(" ");
        DiffChar.diff(words1);
        DiffChar.diff(words2);
        DiffChar.diff(words3);
    }

    static void diff(String[] words) {
        char[] symbols = new char[100];
        for (String word :
                words) {
            boolean isDiff = true;
            checking:
            for (int i = 0; i < word.length(); i++) {
                symbols[i] = word.charAt(i);
                for (int j = 0; j < i; j++) {
                    if (symbols[i] == symbols[j]) {
                        isDiff = false;
                        break checking;
                    }
                }
            }
            if (isDiff) {
                System.out.println("Слово " + word + " не содержит одинаковых символов");
            } else {
                System.out.println("Слово " + word + " содержит одинаковые символы");
            }
        }
        System.out.println();
    }
}

