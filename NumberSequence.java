public class NumberSequence {

    // Function to calculate the nth term of the sequence
    public static int calculateNthTerm(int n) {
        if (n == 0) return 0;
        int term = 0;
        for (int i = 1; i <= n; i++) {
            term += i * i + i;
        }
        return term;
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to generate

        System.out.println("The first " + terms + " terms of the sequence are:");
        for (int i = 0; i < terms; i++) {
            System.out.print(calculateNthTerm(i) + " ");
        }
    }
}