import java.util.Scanner;  
public class ToggleStringExample {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String inputString = scanner.nextLine();  
        scanner.close();  
        String toggledString = toggleString(inputString);  
        System.out.println("Toggled String: " + toggledString);  
    }  
    public static String toggleString(String inputString) {  
        StringBuilder result = new StringBuilder();  
        for (char ch : inputString.toCharArray()) {  
            // Check if the character is an uppercase letter  
            if (Character.isUpperCase(ch)) {  
                // Convert the uppercase letter to lowercase and append to the result  
                result.append(Character.toLowerCase(ch));  
            } else if (Character.isLowerCase(ch)) {  
                // Convert the lowercase letter to uppercase and append to the result  
                result.append(Character.toUpperCase(ch));  
            } else {  
                // If the character is not a letter, simply append it to the result  
                result.append(ch);  
            }  
        }  
        return result.toString();  
    }  
}  