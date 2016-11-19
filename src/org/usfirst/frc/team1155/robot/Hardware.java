package org.usfirst.frc.team1155.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;

public enum Hardware {
	INSTANCE;

	public Joystick gamepad, leftJoystick, rightJoystick;
	public CANTalon frontRightTalon, backRightTalon, frontLeftTalon, backLeftTalon;
	public CANTalon leftShooterTalon, rightShooterTalon;
}
