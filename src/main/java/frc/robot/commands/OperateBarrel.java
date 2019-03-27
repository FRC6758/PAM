/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class OperateBarrel extends Command {
  public OperateBarrel() {
    requires(Robot._BARREL);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    boolean lower = OI.JOYSTICK.getRawButton(RobotMap.BUTTON_LOWER_BARREL);
    boolean raise = OI.JOYSTICK.getRawButton(RobotMap.BUTTON_RAISE_BARREL);
    if(!lower && !raise) {
      Robot._BARREL.BARREL.set(0);
      return;
    }
    double speed = RobotMap.BARREL_SPEED;
    if(lower) speed = -speed;
    Robot._BARREL.BARREL.set(speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
