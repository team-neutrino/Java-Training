package frc.robot.command_factories;

import edu.wpi.first.wpilibj2.command.Command;

public class SuperstructureFactory {
    public static Command runBoth() {
        return MotorFactory.startMotor().alongWith(LEDFactory.turnOrange());
    }
}
