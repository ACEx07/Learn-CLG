import java.util.Scanner;  
public class MagicNumberChecker {  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    scanner.close();  if (isMagicNumber(number)) {
    System.out.println(number + " is a magic number!");
} else {
System.out.println(number + " is not a magic number.");
}
}  
public static boolean isMagicNumber(int num) {
int sum;
while (num > 9) {
sum = 0;
while (num != 0) {
sum += num % 10;
num /= 10;
}
num = sum;
} 
return num == 1;
}
}