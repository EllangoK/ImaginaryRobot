package org.usfirst.frc.team1155.robot.subsystems;
import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;


public class ClawSubsystem extends Subsystem {
  
  private CANTalon lefTal, righTal;
 
  public ClawSubsystem() {
    lefTal = Hardware.INSTANCE.lefTal;
    righTal = Hardware.INSTANCE.righTal;

    lefTal.changeControlMode(TalonControlMode.Follower);
    lefTal.set(righTal.getDeviceID());
  }
  
  public void lift(boolean pushed) {
    if(pushed){
      righTal.set(1);
    }
  }
  
  public void lower(boolean pressed){
    if(pressed){
      righTal.set(-1);
    }
  }
  
  public void stopPls() {
    righTal.set(0);
  }

@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}
}
