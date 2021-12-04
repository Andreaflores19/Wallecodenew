// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveSubsystem extends SubsystemBase {

  public Victor leftRearMotor = new Victor(0);
  public Victor leftFrontMotor = new Victor(5);
  public Victor rightFrontMotor = new Victor(8);
  public Victor rightRearMotor = new Victor(3);

   SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftRearMotor,leftFrontMotor);
   SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightRearMotor, rightFrontMotor); 

   DifferentialDrive yoloDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

   public void controlDrive (double leftSpeed, double rightSpeed) {

    yoloDrive.tankDrive(leftSpeed, rightSpeed);
   }


  /** Creates a new driveSubsystem. */
  public driveSubsystem() {}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
