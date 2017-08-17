package model.entity;


import view.ConsoleView;

public class MutablePowerAppliance extends Appliance {

    private int currentPower;
    private int maxPower;
    private int averagePower;
    private int minPower;

    public MutablePowerAppliance() {
    }



    boolean checkApplianceState() {
        boolean check = (isOn() == false);
        if (check)
            ConsoleView.printMessage(ConsoleView.WARNING);
        return check;
    }

    void switchOnMaxMode() {
        if (checkApplianceState()) {
            currentPower = maxPower;
            ConsoleView.printMessage(ConsoleView.MAX_SET);
        }
    }

    void switchOnAverageMode() {
        if (checkApplianceState()) {
            currentPower = averagePower;
            ConsoleView.printMessage(ConsoleView.AVERAGE_SET);
        }
    }

    void switchOnMinMode() {
        if (checkApplianceState()) {
            currentPower = minPower;
            ConsoleView.printMessage(ConsoleView.MIN_SET);
        }
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getAveragePower() {
        return averagePower;
    }

    public void setAveragePower(int averagePower) {
        this.averagePower = averagePower;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    @Override
    void getApplianceInformation() {
        ConsoleView.printMessage(ConsoleView.MUTABLE_APPLIANCE_INFORMATION);
        super.getApplianceInformation();
    }

    @Override
    public int getPower() {
        return currentPower;
    }

    @Override
    public String toString() {
        return super.toString()+"MutablePowerAppliance{" +
                "currentPower=" + currentPower +
                ", maxPower=" + maxPower +
                ", averagePower=" + averagePower +
                ", minPower=" + minPower +
                '}';
    }
}
