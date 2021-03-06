// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3172.Samuel;

import org.usfirst.frc3172.Samuel.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton leftJoystickDrive;
    public JoystickButton leftJoystickStop;
    public JoystickButton leftJoystickTankGo;
    public JoystickButton leftJoystickElevatorGo;
    public JoystickButton leftJoystickClawGo;
    public JoystickButton leftJoystickPrintLimitSwitch;
    public JoystickButton clawopenReset;
    public JoystickButton clawclosedreset;
    public JoystickButton incOpenCounter;
    public Joystick joystickLeft;
    public JoystickButton rightJoystickDrive;
    public JoystickButton rightJoystickStop;
    public JoystickButton rightJoystickTankGo;
    public JoystickButton rightJoystickElevatorGo;
    public JoystickButton rightJoystickClawGo;
    public JoystickButton elevatorUpReset;
    public JoystickButton elevatorDownReset;
    public JoystickButton autonomous;
    public JoystickButton incClosedCounter;
    public Joystick joystickRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystickRight = new Joystick(1);
        
        incClosedCounter = new JoystickButton(joystickRight, 11);
        incClosedCounter.whenPressed(new IncreaseClawCounterOpen());
        autonomous = new JoystickButton(joystickRight, 10);
        autonomous.whenPressed(new Auto());
        elevatorDownReset = new JoystickButton(joystickRight, 8);
        elevatorDownReset.whenPressed(new initeleDown());
        elevatorUpReset = new JoystickButton(joystickRight, 9);
        elevatorUpReset.whenPressed(new InitEleUp());
        rightJoystickClawGo = new JoystickButton(joystickRight, 4);
        rightJoystickClawGo.whileHeld(new ClawOn());
        rightJoystickElevatorGo = new JoystickButton(joystickRight, 5);
        rightJoystickElevatorGo.whileHeld(new ElevatorOn());
        rightJoystickTankGo = new JoystickButton(joystickRight, 3);
        rightJoystickTankGo.whileHeld(new RightEnableTank());
        rightJoystickStop = new JoystickButton(joystickRight, 2);
        rightJoystickStop.whenPressed(new DriveLeftRightStop());
        rightJoystickDrive = new JoystickButton(joystickRight, 1);
        rightJoystickDrive.whenPressed(new DriveRight());
        joystickLeft = new Joystick(0);
        
        incOpenCounter = new JoystickButton(joystickLeft, 11);
        incOpenCounter.whenPressed(new IncreaseClawCounterOpen());
        clawclosedreset = new JoystickButton(joystickLeft, 9);
        clawclosedreset.whenPressed(new initclosedclaw());
        clawopenReset = new JoystickButton(joystickLeft, 8);
        clawopenReset.whenPressed(new InitOpenCLaw());
        leftJoystickPrintLimitSwitch = new JoystickButton(joystickLeft, 10);
        leftJoystickPrintLimitSwitch.whenPressed(new PrintLimitSwitch());
        leftJoystickClawGo = new JoystickButton(joystickLeft, 4);
        leftJoystickClawGo.whileHeld(new ClawOn());
        leftJoystickElevatorGo = new JoystickButton(joystickLeft, 5);
        leftJoystickElevatorGo.whileHeld(new ElevatorOn());
        leftJoystickTankGo = new JoystickButton(joystickLeft, 3);
        leftJoystickTankGo.whileHeld(new LeftEnableTank());
        leftJoystickStop = new JoystickButton(joystickLeft, 2);
        leftJoystickStop.whenPressed(new DriveLeftRightStop());
        leftJoystickDrive = new JoystickButton(joystickLeft, 1);
        leftJoystickDrive.whenPressed(new DriveLeft());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Elevator Stop", new ElevatorStop());

        SmartDashboard.putData("Elevator Rise", new ElevatorRise());

        SmartDashboard.putData("Elevator Lower", new ElevatorLower());

        SmartDashboard.putData("Claw Stop", new ClawStop());

        SmartDashboard.putData("Claw Open", new ClawOpen());

        SmartDashboard.putData("Claw Close", new ClawClose());

        SmartDashboard.putData("Drive Stop", new DriveStop());

        SmartDashboard.putData("Drive Forward R", new DriveForwardR());

        SmartDashboard.putData("Drive Backward R", new DriveBackwardR());

        SmartDashboard.putData("Drive Backwards L", new DriveBackwardsL());

        SmartDashboard.putData("Drive Forward L", new DriveForwardL());

        SmartDashboard.putData("Drive Right", new DriveRight());

        SmartDashboard.putData("Drive Left", new DriveLeft());

        SmartDashboard.putData("Drive Forward", new DriveForward());

        SmartDashboard.putData("Drive Backward", new DriveBackward());

        SmartDashboard.putData("Tank Drive", new TankDrive());

        SmartDashboard.putData("Elevator Joystick", new ElevatorJoystick());

        SmartDashboard.putData("Claw Joystick", new ClawJoystick());

        SmartDashboard.putData("Drive LeftRight Stop", new DriveLeftRightStop());

        SmartDashboard.putData("Elevator On", new ElevatorOn());

        SmartDashboard.putData("Claw On", new ClawOn());

        SmartDashboard.putData("Tank Drive On", new TankDriveOn());

        SmartDashboard.putData("PrintLimitSwitch", new PrintLimitSwitch());

        SmartDashboard.putData("Init Ele Up", new InitEleUp());

        SmartDashboard.putData("init ele Down", new initeleDown());

        SmartDashboard.putData("Init Open CLaw", new InitOpenCLaw());

        SmartDashboard.putData("init closed claw", new initclosedclaw());

        SmartDashboard.putData("Left Enable Tank", new LeftEnableTank());

        SmartDashboard.putData("Right Enable Tank", new RightEnableTank());

        SmartDashboard.putData("Auto", new Auto());

        SmartDashboard.putData("Increase Claw Counter Open", new IncreaseClawCounterOpen());

        SmartDashboard.putData("Increase Claw counter CLosed", new IncreaseClawcounterCLosed());

        SmartDashboard.putData("Command Group 1", new CommandGroup1());

        SmartDashboard.putData("autoForward", new autoForward());

        SmartDashboard.putData("autoForward2", new autoForward2());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystickLeft() {
        return joystickLeft;
    }

    public Joystick getJoystickRight() {
        return joystickRight;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

