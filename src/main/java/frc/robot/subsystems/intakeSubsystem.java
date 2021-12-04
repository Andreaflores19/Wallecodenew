// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class intakeSubsystem extends SubsystemBase {
  public Victor leftIntake = new Victor(Constants.leftIntake);
  public Victor rightIntake = new Victor(Constants.rightIntake);

  public void takeIn(){
    leftIntake.set(1* Constants.takeIn); 
    rightIntake.set(-1* Constants.takeIn);

  }
  
  public void takeOut(){
    leftIntake.set(-1*Constants.takeOut);
    rightIntake.set(1*Constants.takeOut);
  }

  public void stop(){
    leftIntake.set(0);
    rightIntake.set(0);
  }
  /** Creates a new intakeSubsystem. */
  public intakeSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
