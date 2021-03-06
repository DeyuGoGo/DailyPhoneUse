package go.deyu.bloodscreen;

import java.util.TimerTask;

import go.deyu.bloodscreen.app.DeviceStatus;

/**
 * Created by huangeyu on 15/5/4.
 */
public class AddBloodTimeTask extends TimerTask {

    private BloodControllerInterface mController;

    private DeviceStatus mDeviceStatus ;

    public AddBloodTimeTask(BloodControllerInterface controller){
        this.mController = controller;
        mDeviceStatus = DeviceStatus.getInstance();
    }
    /**
     * The task to run should be specified in the implementation of the {@code run()}
     * method.
     */
    @Override
    public void run() {
        if(mDeviceStatus.isScreenOn()) mController.addBlood();
    }
}
