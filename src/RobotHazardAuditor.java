import java.util.Scanner;

/*
 * UC5_RobotHazardRefactor
 * ----------------------
 * Moves validation and calculation into a separate method.
 */
class UC5_RobotHazardRefactor {

    static double calculateHazardRisk(double armPrecision,
                                      int workerDensity,
                                      String machineryState) {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Invalid Arm Precision");
            return -1;
        }

        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Invalid Worker Density");
            return -1;
        }

        double machineRiskFactor = 2.0;
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double armPrecision = scanner.nextDouble();
        int workerDensity = scanner.nextInt();
        String machineryState = scanner.next();

        double risk = calculateHazardRisk(
                armPrecision, workerDensity, machineryState);

        if (risk != -1) {
            System.out.println("Robot Hazard Risk Score: " + risk);
        }

        scanner.close();
    }
}