package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;

import static frc.robot.util.Constants.MotorConstants.*;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

public class Motor extends SubsystemBase {
    private TalonFX m_motor;
    private TalonFXConfiguration m_motorConfig;
    private double m_speed = 0.0;
    private final CurrentLimitsConfigs m_currentLimitConfig = new CurrentLimitsConfigs();

    public Motor() {
        m_motor = new TalonFX(MOTOR_ID);
        m_motorConfig = new TalonFXConfiguration();

        m_currentLimitConfig.withSupplyCurrentLimit(CURRENT_LIMIT)
                .withSupplyCurrentLimitEnable(true)
                .withStatorCurrentLimit(CURRENT_LIMIT)
                .withStatorCurrentLimitEnable(true);

        m_motorConfig.CurrentLimits = m_currentLimitConfig;

        m_motor.getConfigurator().apply(m_motorConfig);
    }

    public double getMotorRPM() {
        return m_motor.getVelocity().getValueAsDouble() * 60;
    }

    @Override
    public void periodic() {
        m_motor.set(m_speed);
        System.out.println(getMotorRPM());
    }

    public Command defaultMotorCommand() {
        return run(() -> {
            m_speed = 0.0;
        });
    }

    public Command runMotor(double inputSpeed) {
        return run(() -> {
            m_speed = inputSpeed;
        });
    }
}