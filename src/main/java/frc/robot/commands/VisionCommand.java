// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.VisionSubsystem;

public class VisionCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  private final VisionSubsystem m_VisionSubsystem;

  public VisionCommand(VisionSubsystem subsystem) {
    m_VisionSubsystem = subsystem;

    addRequirements(m_VisionSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    Pose2d fakePose = new Pose2d(0, 0, new Rotation2d(10));

    m_VisionSubsystem.getFieldtoCube(fakePose);
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false; 
  }
}