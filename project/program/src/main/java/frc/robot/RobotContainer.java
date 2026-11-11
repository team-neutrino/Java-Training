// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.command_factories.LEDFactory;
import frc.robot.command_factories.MotorFactory;
import frc.robot.command_factories.SuperstructureFactory;
import frc.robot.util.SubsystemContainer;
import frc.robot.util.Constants.OperatorConstants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import static frc.robot.util.SubsystemContainer.*;

public class RobotContainer {
  public SubsystemContainer subsystems = new SubsystemContainer();

  private final CommandXboxController m_driverController = new CommandXboxController(
      OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    configureDefaultCommands();
    configureBindings();
  }

  private void configureDefaultCommands() {
    motor.setDefaultCommand(motor.defaultMotorCommand());
    led.setDefaultCommand(led.defaultLEDCommand());
  }

  private void configureBindings() {
    m_driverController.rightTrigger().whileTrue(MotorFactory.startMotor());
    m_driverController.leftTrigger().whileTrue(LEDFactory.turnOrange());
    m_driverController.leftBumper().whileTrue(LEDFactory.turnRainbow());
    m_driverController.a().whileTrue(SuperstructureFactory.runBoth());

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
