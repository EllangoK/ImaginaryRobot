package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.GyroSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class TiltSensesCommand extends Command {
	
	private GyroSubsystem sense  = robot.SenseT;

	public TiltCommand() {
		requires(Robot.gyro);
		
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected double execute() {
		return sense.getGyroAngle();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		end();
	}
}
