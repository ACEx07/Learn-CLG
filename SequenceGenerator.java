public class SequenceGenerator {

    // Function to calculate the nth term of the sequence
    public static int calculateNthTerm(int n) {
        // The nth term seems to follow a cubic pattern: n^3 + a linear adjustment
        return (n * n * n) + n * n;
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to generate

        System.out.println("The first " + terms + " terms of the sequence are:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(calculateNthTerm(i) + " ");
        }
    }
}