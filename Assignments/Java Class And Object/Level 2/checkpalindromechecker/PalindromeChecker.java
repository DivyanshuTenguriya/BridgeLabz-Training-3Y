package checkpalindromechecker;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}
