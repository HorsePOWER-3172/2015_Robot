// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3172.Samuel.subsystems;

import org.usfirst.frc3172.Samuel.Robot;
import org.usfirst.frc3172.Samuel.RobotMap;
import org.usfirst.frc3172.Samuel.commands.ClawJoystick;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Claw extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController clawMotor = RobotMap.clawClawMotor;
    DigitalInput clawOpen = RobotMap.clawClawOpen;
    DigitalInput clawClose = RobotMap.clawClawClose;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    double close = 1;//Might be backwards in which case change ones to negative ones
	double open = -1;//Might be backwards in which case change ones to positive ones
	boolean enable = false;
	Counter clawCountOpen = new Counter(clawOpen);
	Counter clawCountClosed = new Counter(clawClose);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ClawJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void printLimitSwitches() {
    	System.out.println("Claw SubSystem clawOpen limitswitch = " + clawCountOpen.get());
    	System.out.println("Claw SubSystem clawClose limitswitch = " + clawCountClosed.get());
    }
    public void enable() {
    	enable = true;
    }
    public void disable() {
    	enable = false;
    }
   /* public void IncOpen() {
    	clawCountOpen = new Counter(10);
    	System.out.println("clawOpen limitswitch = " + clawCountOpen.get());
    }
    public void IncClosed() {
    	clawCountClosed = new Counter(10);
    	System.out.println("clawclosed limitswitch = " + clawCountClosed.get());
    }*/
    public boolean isOpen() {
    	return clawCountOpen.get() > 0; 
    }
    public boolean isClosed() {
    	return clawCountClosed.get() > 0; 
    }
    public void initializeCounterOpen() {
    	clawCountOpen.reset();
    	System.out.println("initialized clawCountOpen");
		System.out.println("open claw limitswitch = " + clawCountOpen.get());
    }
    public void initializeCounterClose() {
    	clawCountClosed.reset();
    	System.out.println("initialized clawCountClosed");
		System.out.println("closed claw limitswitch = " + clawCountClosed.get());
    }
    
    public void close() {
    	clawMotor.set(close);
    }
    public void open() {
    	clawMotor.set(open);
    }
    public void stop() {
        clawMotor.set(0);
    }
    //public void joystickClaw(Joystick left) {
    //	if (enable) clawMotor.set(-left.getAxis(AxisType.kX));
    //}
    public void joystickClaw(Joystick left) {
		if (enable) {
			if ((clawCountOpen.get() < 1)) {
				if (left.getAxis(AxisType.kX) < .1) {
					clawMotor.set(-left.getAxis(AxisType.kX));
					System.out.println("Open");
					System.out.println("Joystick = " + left.getAxis(AxisType.kX));
					Robot.claw.initializeCounterClose();
				}
			}
			if ((clawCountClosed.get() < 1)) {
				if (left.getAxis(AxisType.kX) > .1) {
					clawMotor.set(-left.getAxis(AxisType.kX));
					System.out.println("Close");
					System.out.println("Joystick = " + left.getAxis(AxisType.kX));
					Robot.claw.initializeCounterOpen();
				}
			}
		}
		return;
	}

    
}
