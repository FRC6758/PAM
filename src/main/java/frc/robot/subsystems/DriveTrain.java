/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.Drive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark SPARK_LF = new Spark(RobotMap.MOTOR_LF);
  public Spark SPARK_LR = new Spark(RobotMap.MOTOR_LR);
  public Spark SPARK_RF = new Spark(RobotMap.MOTOR_RF);
  public Spark SPARK_RR = new Spark(RobotMap.MOTOR_RR);

  public SpeedControllerGroup DRIVETRAIN_LEFT = new SpeedControllerGroup(SPARK_LF, SPARK_LR);
  public SpeedControllerGroup DRIVETRAIN_RIGHT = new SpeedControllerGroup(SPARK_RF, SPARK_RR);

  public DifferentialDrive DRIVETRAIN = new DifferentialDrive(DRIVETRAIN_LEFT, DRIVETRAIN_RIGHT);
  

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Drive());
  }
}
