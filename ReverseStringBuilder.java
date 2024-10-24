public class ReverseStringBuilder {
    public static void main(String[] args) {
        String str = "Gautham";
        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string: " + sb.reverse().toString());
    }
}