package org.usfirst.frc.team1155.robot.commands;
import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.ClawSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.buttons


public class LiftCommand extends Command {
  private static InternalButton pushyDevice;
  
  private ClawSubsystem brodoyouevenlift = Robot.lift;
  
  public LiftCommand() {
    requires(Robot.lift);
    
    pushyDevice = Hardware.INSTANCE.liftButton;
  }
  
  @Override
  protected void initialize() {
  }
  
  @Override
  protected void execute() {
    brodoyouevenlift.lift(pushyDevice.get());
  }
  
  @Override
  protected boolean isFinished() {
    return false;
  }
  
  @Override
  protected void end() {
    brodoyouevenlift.stopPls();
  }
  
  @Override
  protected void interrupted() {
    end();
  }
}
