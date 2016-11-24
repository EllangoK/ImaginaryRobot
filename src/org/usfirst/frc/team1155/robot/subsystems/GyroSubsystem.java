package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.PortMap;
import org.usfirst.frc.team1155.robot.Robot;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GyroSubsystem extends Subsystem {

	private Gyro gyro;
	
	public GyroSubsystem() {
		gyro = Hardware.INSTANCE.gyro;	
		}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}