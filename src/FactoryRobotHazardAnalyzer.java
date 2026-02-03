/*
 * FactoryRobotHazardAnalyzer
 * --------------------------
 * This class contains the main method.
 * It accepts user inputs and invokes the
 * RobotHazardAuditor to calculate the hazard risk.
 *
 * It also handles RobotSafetyException using try-catch.
 */
import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // Display application title
        System.out.println("Factory Robot Hazard Analyzer");

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read arm precision
        System.out.println("Enter Arm Precision (0.0 - 1.0):");
        double armPrecision = sc.nextDouble();

        // Read worker density
        System.out.println("Enter Worker Density (1 - 20):");
        int workerDensity = sc.nextInt();
        sc.nextLine(); // consume newline

        // Read machinery state
        System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
        String machineryState = sc.nextLine();

        // Create RobotHazardAuditor object
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            // Call method to calculate hazard risk
            double risk = auditor.calculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // Display hazard risk score
            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            // Display exception message
            System.out.println(e.getMessage());
        }
    }
}
