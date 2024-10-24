/*public class PalindromeCheckStringBuilder {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}*/
public class PalindromeCheckRecursion {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true; // Base case
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursively check the substring
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false; // Not a palindrome
    }
}