public class VowelCount {
    public static void main(String[] args) {
        String str = "Gautham";
        System.out.println("Number of vowels: " + countVowels(str));
    }
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}