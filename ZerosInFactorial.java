import java.util.*;

public class ZerosInFactorial {
    public static int countZeros(int num) {
        int zeros = 0;
        while (num >= 5) {
            num /= 5;
            zeros += num;
        }
        return zeros;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = countZeros(num);
        System.out.println("Zeros in factorial: " + result);
        scanner.close();
    }
}