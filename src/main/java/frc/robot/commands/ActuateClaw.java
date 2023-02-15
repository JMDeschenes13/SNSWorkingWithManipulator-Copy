// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Claw;

public class ActuateClaw extends CommandBase {
  /** Creates a new OpenValveFireShot. */
  private final Claw m_claw;
  private boolean clawClosed = true;

  public ActuateClaw(Claw claw) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_claw = claw;

    addRequirements(claw);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (clawClosed){
      m_claw.clawOpen();
      clawClosed = false;
    
      
    }
    else{
      m_claw.clawClose();
      clawClosed = true;
      
    }
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
