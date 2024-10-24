import java.util.*;

public class NthSmallestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int[] arr = new int[X];
        for (int i = 0; i < X; i++) {
            arr[i] = scanner.nextInt();
        }
        int N = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[N - 1]);
        scanner.close();
    }
}