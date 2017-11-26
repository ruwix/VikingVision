package org.ljrobotics.vikingvision.comm;

public interface RobotConnectionStateListener {
    void robotConnected();

    void robotDisconnected();
}
