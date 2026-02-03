import java.util.Scanner;

/*
 * UC4_RobotHazardValidation
 * ------------------------
 * Validates inputs using conditional logic before calculation.
 */
class UC4_RobotHazardValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Arm Precision:");
        double armPrecision = scanner.nextDouble();

        System.out.println("Enter Worker Density:");
        int workerDensity = scanner.nextInt();

        System.out.println("Enter Machinery State:");
        String machineryState = scanner.next();

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Invalid Arm Precision");
        }
        // Validate worker density
        else if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Invalid Worker Density");
        }
        // Validate machinery state
        else if (!machineryState.equals("Worn")
                && !machineryState.equals("Faulty")
                && !machineryState.equals("Critical")) {
            System.out.println("Invalid Machinery State");
        }
        else {
            double risk = ((1.0 - armPrecision) * 15.0)
                    + (workerDensity * 2.0);
            System.out.println("Robot Hazard Risk Score: " + risk);
        }

        scanner.close();
    }
}