import java.util.Scanner;
public class prg1 {
    static int calculateAsciiSum(char[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            int y = (int) A[i];
            sum = sum + y;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        char[] A = n.toCharArray();
        int output = calculateAsciiSum(A);
        System.out.println(output);

        sc.close(); // close the Scanner object
    }
}