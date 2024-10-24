public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of the string
        System.out.println("Length: " + str.length());

        // Concatenation
        String newStr = str + " Welcome to Java!";
        System.out.println("Concatenated String: " + newStr);

        // Substring
        System.out.println("Substring: " + str.substring(7));

        // Case conversion
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Character at specific index
        System.out.println("Character at index 1: " + str.charAt(1));

        // Replacing characters
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        // Split
        String fruits = "apple,banana,orange";
        String[] fruitArray = fruits.split(",");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}