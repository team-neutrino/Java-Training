package frc.robot.command_factories;

import static frc.robot.util.Constants.MotorConstants.*;
import static frc.robot.util.SubsystemContainer.motor;

import edu.wpi.first.wpilibj2.command.Command;

public class MotorFactory {
    public static Command startMotor() {
        return motor.runMotor(RUN_SPEED);
    }
}
