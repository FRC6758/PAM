/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static final int MOTOR_LF = 0;
  public static final int MOTOR_LR = 1;
  public static final int MOTOR_RF = 2;
  public static final int MOTOR_RR = 3;

  public static final int MOTOR_BARREL = 4;
  public static final double BARREL_SPEED = .5;

  public static final int BUTTON_FILL = 2;
  public static final int BUTTON_RAISE_BARREL = 5;
  public static final int BUTTON_LOWER_BARREL = 3;

  public static final int FILL_SOLENOID = 0;
  public static final int FIRE_SOLENOID = 1;
  
}
