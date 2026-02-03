/*
 * RobotHazardAuditor
 * ------------------
 * This class contains the business logic for calculating
 * the hazard risk score of a factory robot.
 *
 * It validates all inputs and throws RobotSafetyException
 * when invalid data is encountered.
 */
public class RobotHazardAuditor {

    /*
     * calculateHazardRisk
     * -------------------
     * Validates inputs and calculates the hazard risk score
     * based on arm precision, worker density, and machinery state.
     */
    public double calculateHazardRisk(double armPrecision,
                                      int workerDensity,
                                      String machineryState)
            throws RobotSafetyException {

        // Validate arm precision range
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        // Validate worker density range
        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

        // Determine machinery risk factor
        double machineRiskFactor;

        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        }
        else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        }
        else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        }
        else {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state"
            );
        }

        // Calculate and return hazard risk score
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }
}
