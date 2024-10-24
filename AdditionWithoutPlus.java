public class AdditionWithoutPlus {

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        int result = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}