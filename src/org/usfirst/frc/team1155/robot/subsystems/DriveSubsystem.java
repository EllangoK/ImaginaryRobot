
package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.PortMap;
import org.usfirst.frc.team1155.robot.Robot;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	private CANTalon frontRightTalon, backRightTalon, frontLeftTalon, backLeftTalon;

	public DriveSubsystem() {
		frontRightTalon = new CANTalon(PortMap.DRIVE_FRONT_RIGHT_TALON);
		frontLeftTalon = new CANTalon(PortMap.DRIVE_FRONT_LEFT_TALON);
		backRightTalon = new CANTalon(PortMap.DRIVE_BACK_RIGHT_TALON);
		backLeftTalon = new CANTalon(PortMap.DRIVE_BACK_LEFT_TALON);
		frontRightTalon = Hardware.INSTANCE.frontRightTalon;
		backRightTalon = Hardware.INSTANCE.backRightTalon;
		frontLeftTalon = Hardware.INSTANCE.frontLeftTalon;
		backLeftTalon = Hardware.INSTANCE.backLeftTalon;

		backRightTalon.changeControlMode(TalonControlMode.Follower);
		backRightTalon.set(frontRightTalon.getDeviceID());

		backLeftTalon.changeControlMode(TalonControlMode.Follower);
		backLeftTalon.set(frontLeftTalon.getDeviceID());
	}

	public void setSpeed(double speedLeft, double speedRight) {
		frontRightTalon.set(speedRight);
		frontLeftTalon.set(speedLeft);
	}

	public void stopMotion() {
		frontRightTalon.set(0);
		frontLeftTalon.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}
