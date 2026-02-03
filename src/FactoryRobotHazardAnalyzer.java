import java.util.Scanner;

/*
 * UC2_RobotHazardInput
 * -------------------
 * Accepts robot hazard-related inputs from the user
 * and echoes them back without validation.
 */
class UC2_RobotHazardInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read arm precision
        System.out.println("Enter Arm Precision:");
        double armPrecision = scanner.nextDouble();

        // Read worker density
        System.out.println("Enter Worker Density:");
        int workerDensity = scanner.nextInt();

        // Read machinery state
        System.out.println("Enter Machinery State:");
        String machineryState = scanner.next();

        // Echo inputs
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        scanner.close();
    }
}