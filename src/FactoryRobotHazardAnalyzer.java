import java.util.Scanner;

/*
 * UC3_RobotHazardCalculation
 * -------------------------
 * Calculates hazard risk score assuming all inputs are valid.
 */
class UC3_RobotHazardCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Arm Precision:");
        double armPrecision = scanner.nextDouble();

        System.out.println("Enter Worker Density:");
        int workerDensity = scanner.nextInt();

        System.out.println("Enter Machinery State:");
        String machineryState = scanner.next();

        // Temporary risk factor (assumed)
        double machineRiskFactor = 2.0;

        // Hazard risk calculation
        double risk = ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + risk);

        scanner.close();
    }
}