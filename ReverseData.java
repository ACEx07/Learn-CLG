import java.util.*;

public class ReverseData {
    public static int reverseNumber(int data) {
        int reversedNumber = 0;
        while (data != 0) {
            int lastDigit = data % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            data /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        int result = reverseNumber(data);
        System.out.println("Reversed data: " + result);
        scanner.close();
    }
}