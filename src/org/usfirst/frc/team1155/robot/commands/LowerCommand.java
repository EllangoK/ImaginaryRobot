package org.usfirst.frc.team1155.robot.commands;
import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.ClawSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.buttons.InternalButton;


public class LowerCommand extends Command {
  private static InternalButton pressyMachine;
  
  private ClawSubsystem nahIlower = Robot.lower;
  
  public LowerCommand() {
    requires(Robot.lower);
    
    pressyMachine = Hardware.INSTANCE.lowerButton;
  }
  
  @Override
  protected void initialize() {
  }
  
  @Override
  protected void execute() {
    nahIlower.lower(pressyMachine.get());
  }
  
  @Override
  protected boolean isFinished() {
    return false;
  }
  
  @Override
  protected void end() {
    nahIlower.stopPls();
  }
  
  @Override
  protected void interrupted() {
    end();
  }
}
