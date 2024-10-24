import java.util.*;

public class NeedleInHaystack {
    public static int countOccurrences(int needle, int haystack) {

        String needleStr = Integer.toString(needle);
        String haystackStr = Integer.toString(haystack);

        int occurrences = 0;
        for (int i = 0; i < haystackStr.length(); i++) {
            if (haystackStr.charAt(i) == needleStr.charAt(0)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the needle (a digit): ");
        int needle = scanner.nextInt();
        System.out.print("Enter the haystack (a positive number): ");
        int haystack = scanner.nextInt();

        int result = countOccurrences(needle, haystack);
        System.out.println("Occurrences of " + needle + " in " + haystack + ": " + result);
        scanner.close();
    }
}