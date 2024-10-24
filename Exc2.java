import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 10: ");
        int number = scanner.nextInt();
        
        if (number <= 10) {
            throw new ArithmeticException("Number is not greater than 10.");
        } else {
            System.out.println("You entered: " + number);
        }
        
        scanner.close();
    }
}