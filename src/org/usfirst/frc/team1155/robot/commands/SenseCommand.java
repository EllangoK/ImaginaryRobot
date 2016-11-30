package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.GyroSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class SenseCommand extends Command {

	private GyroSubsystem sense = Robot.gyro;

	public SenseCommand() {
		requires(Robot.gyro);

	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		double temp = sense.getGyroAngle();
		// Don't know what to with the Gyro Output
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
