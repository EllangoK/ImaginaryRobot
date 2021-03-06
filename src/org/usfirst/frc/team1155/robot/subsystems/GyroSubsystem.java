package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.PortMap;
import org.usfirst.frc.team1155.robot.Robot;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GyroSubsystem extends Subsystem {

	private AnalogGyro gyro;
	
	public GyroSubsystem() {
		gyro = Hardware.INSTANCE.gyro;	
		}

	public void calibrateGyro(){
	gyro.calibrate();
	}
	
	public void initalizeGyro(){
	gyro.initGyro();
	}
	
	public void resetGyro(){
	gyro.reset();
	}
	
	public double getGyroAngle(){
	return gyro.getAngle();
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}
