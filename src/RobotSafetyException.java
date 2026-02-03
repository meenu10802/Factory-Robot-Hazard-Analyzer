/*
 * RobotSafetyException
 * --------------------
 * Custom exception for robot safety violations.
 */
class RobotSafetyException extends Exception {

    RobotSafetyException(String message) {
        super(message);
    }
}