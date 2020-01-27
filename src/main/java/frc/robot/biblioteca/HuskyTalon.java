package frc.robot.biblioteca;
import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class HuskyTalon extends Motor {
    TalonSRX talon;
    public HuskyTalon(final int port) {
        talon = new TalonSRX(port);
    }

    @Override
    public void doActions(){
        talon.set(ControlMode.PercentOutput, this.getTargetSpeed());
    }
}
