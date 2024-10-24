import java.util.*;

public class CarCostComparison {
    public static double calculateTotalCost(int A, int B, int C, int D, int E) {
        double fuelCost = (D * 60.0 / A) * B;
        double maintenanceCost = E * 60;
        return C + fuelCost + maintenanceCost;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A1 = scanner.nextInt();
        int B1 = scanner.nextInt();
        int C1 = scanner.nextInt();
        int D1 = scanner.nextInt();
        int E1 = scanner.nextInt();
        int A2 = scanner.nextInt();
        int B2 = scanner.nextInt();
        int C2 = scanner.nextInt();
        int D2 = scanner.nextInt();
        int E2 = scanner.nextInt();
        double petrolTotalCost = calculateTotalCost(A1, B1, C1, D1, E1);
        double dieselTotalCost = calculateTotalCost(A2, B2, C2, D2, E2);
        if (petrolTotalCost < dieselTotalCost) {
            System.out.println("petrol");
        } else {
            System.out.println("diesel");
        }
        scanner.close();
    }
}