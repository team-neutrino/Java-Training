// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class PrishaMotor extends SubsystemBase {
  private TalonFX m_pmotor= new TalonFX(14);
  private TalonFXConfiguration m_motorconfig;
  
  public PrishaMotor() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
