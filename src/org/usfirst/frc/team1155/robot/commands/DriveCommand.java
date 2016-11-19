package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command {
	private static Joystick leftJoy, rightJoy;

	private DriveSubsystem drive = Robot.drive;

	public DriveCommand() {
		requires(Robot.drive);
		leftJoy = Hardware.INSTANCE.leftJoystick;
		rightJoy = Hardware.INSTANCE.rightJoystick;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		drive.setSpeed(leftJoy.getY(), rightJoy.getY());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		drive.stopMotion();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
