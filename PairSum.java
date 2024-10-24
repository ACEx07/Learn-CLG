public class PairSum {

    // Function to calculate the answer based on the input pair
    public static int calculate(int a, int b, int c) {
        return (a + b + c) - 2;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int result = calculate(a, b, c);
        System.out.println("Pair: " + a + " " + b + " " + c);
        System.out.println("Ans: " + result);
    }
}