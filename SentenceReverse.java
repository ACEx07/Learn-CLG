import java.util.Scanner;

public class SentenceReverse {

    // Function to reverse the words in a sentence
    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Initialize an empty string to store the reversed sentence
        String reversedSentence = "";

        // Loop through the words in reverse order and concatenate them
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        // Trim any trailing spaces and return the reversed sentence
        return reversedSentence.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversed = reverseSentence(sentence);
        System.out.println("Reversed sentence: " + reversed);

        scanner.close();
    }
}