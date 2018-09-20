package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "TELEOP")
@Disabled
public class MainTeleOp extends OpMode {
    DcMotor left, right;

    @Override
    public void init() {
        left = hardwareMap.get(DcMotor.class, "left");
        right = hardwareMap.get(DcMotor.class, "right");
        left.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        double lefty = -gamepad1.left_stick_y;
        double righty = gamepad1.right_stick_y;
        lefty = Range.clip(lefty, -1.0, 1.0);
        righty = Range.clip(righty, -1.0, 1.0);
        left.setPower(lefty);
        right.setPower(righty);
    }
}
