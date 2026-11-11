package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.util.Constants.LEDConstants.*;

public class LED extends SubsystemBase {

    private AddressableLED m_led;
    private AddressableLEDBuffer m_ledBuffer;
    private int m_count;

    public LED() {
        m_led = new AddressableLED(LED_PORT);

        m_ledBuffer = new AddressableLEDBuffer(NUMBER_OF_LEDS);
        m_led.setLength(m_ledBuffer.getLength());

        m_led.setData(m_ledBuffer);
        m_led.start();
    }

    @Override
    public void periodic() {
        m_led.setData(m_ledBuffer);
    }

    public Command defaultLEDCommand() {
        return run(() -> {
            for (int i = 0; i < NUMBER_OF_LEDS; i++) {
                m_ledBuffer.setRGB(i, DEFAULT_COLOR[0], DEFAULT_COLOR[1], DEFAULT_COLOR[2]);
            }
        });
    }

    public Command setLEDColor(int[] color) {
        return run(() -> {
            for (int i = 0; i < NUMBER_OF_LEDS; i++) {
                m_ledBuffer.setRGB(i, color[0], color[1], color[2]);
            }
        });
    }

    public Command runRainbow() {
        return run(() -> {
            for (int a = 0; a < NUMBER_OF_LEDS; a++) {
                for (int i = 0; i < NUMBER_OF_LEDS; i++) {
                    m_ledBuffer.setHSV(i, (i + a) * 36, 255, 255);
                }
            }
        });
    }

}
