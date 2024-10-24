public class ReverseStringNum {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7,8,9";
        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string: " + sb.reverse().toString());
    }
}