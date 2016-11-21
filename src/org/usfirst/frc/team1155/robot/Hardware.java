package org.usfirst.frc.team1155.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;

public enum Hardware {
	INSTANCE;

	public Joystick gamepad, leftJoystick, rightJoystick;
	public CANTalon frontRightTalon, backRightTalon, frontLeftTalon, backLeftTalon;
	public CANTalon lefTal, righTal;
	public InternalButton lowerButton, liftButton;
	
	Hardware(){
	gamepad = new Joystick(0);
	leftJoystick = new Joystick(1);
	rightJoystick = new Joystick(2);
	frontRightTalon = new CANTalon(0);
	backRightTalon = new CANTalon(2);
	frontLeftTalon = new CANTalon(3);
	backLeftTalon = new CANTalon(5);
	lefTal = new CANTalon(10);
	righTal = new CANTalon(11);
	lowerButton = new InternalButton(1)
	liftButton = new InternalButton(2)
	}
}
