package frc.robot.command_factories;

import static frc.robot.util.Constants.LEDConstants.*;
import static frc.robot.util.SubsystemContainer.led;

import edu.wpi.first.wpilibj2.command.Command;

public class LEDFactory {
    public static Command turnOrange() {
        return led.setLEDColor(ORANGE);
    }

    public static Command turnRainbow() {
        return led.runRainbow();
    }
}
