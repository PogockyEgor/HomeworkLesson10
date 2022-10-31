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
        boolean isPalindrome = true;
        for (String word :
                words) {
            boolean isNumbers = true;
            for (int i = 0; i < word.length(); i++) {
                if (words[i].equals("[^0-9]")){
                }
                isPalindrome = true;
                if (isNumbers) {
                    for (int j = 0; j < words.length / 2; j++) {
                        if (!(symbols[j] == symbols[word.length() - j])) {
                            isPalindrome = false;
                        }
                    }
                }

            }
            if (isPalindrome) {
                System.out.println(word);
            }
        }
    }
}