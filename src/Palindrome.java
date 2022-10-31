import java.util.Scanner;

public class Palindrome {

    public static void palindrome() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");
        String[] words3 = str3.split(" ");
        Palindrome.diff(words1);
        Palindrome.diff(words2);
        Palindrome.diff(words3);
    }

    static void diff(String[] words) {
        char[] symbols = new char[100];
        char[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean isPalindrome = true;
        for (String word :
                words) {
            if (word.matches("\\b[0-9]+[0-9]") == isPalindrome) {

                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                        isPalindrome = false;
                    }
                }
                if (isPalindrome) {
                    System.out.println(word);
                }
            }
        }
    }
}