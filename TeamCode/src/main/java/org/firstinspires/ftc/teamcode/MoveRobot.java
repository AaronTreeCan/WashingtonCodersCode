package org.firstinspires.ftc.teamcode;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.FORWARD;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class MoveRobot extends LinearOpMode {

    private DcMotor FrontLeftMotor;
    private DcMotor FrontRightMotor;
    private DcMotor BackLeftMotor;
    private DcMotor BackRightMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        FrontLeftMotor = hardwareMap.get(DcMotor.class, "30");
        FrontRightMotor = hardwareMap.get(DcMotor.class, "22");
        BackLeftMotor = hardwareMap.get(DcMotor.class, "23");
        BackRightMotor = hardwareMap.get(DcMotor.class, "31");

        telemetry.addData("Status", "Initialized");
        telemetry.update(); // Appear on driver station
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // MotorName.setPower(); 0-1
        // sleep(time); *time is in milliseconds
        // MotorName.setDirection();
        FrontLeftMotor.setDirection(REVERSE); //Forward=REVERSE real life movement
        FrontRightMotor.setDirection(REVERSE);
        BackLeftMotor.setDirection(FORWARD); //Forward=REVERSE real life movement
        BackRightMotor.setDirection(FORWARD);
        FrontLeftMotor.setPower(.5);
        FrontRightMotor.setPower(.5);
        BackLeftMotor.setPower(.5);
        BackRightMotor.setPower(.5);
        sleep(5000);
        FrontLeftMotor.setPower(0);
        FrontRightMotor.setPower(0);
        BackLeftMotor.setPower(0);
        BackLeftMotor.setPower(0);


    }
}













































/* basic function skeleton code

    public void functionName(double time, ) {
        

    }

 */