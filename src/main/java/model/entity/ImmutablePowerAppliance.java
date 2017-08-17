package model.entity;


import view.ConsoleView;

public class ImmutablePowerAppliance extends Appliance {

    boolean hightPowerAppliance;

    public ImmutablePowerAppliance() {
    }

    @Override
    void getApplianceInformation() {
        ConsoleView.printMessage(ConsoleView.IMMUTABLE_APPLIANCE_INFORMATION);
        super.getApplianceInformation();
    }

    public boolean isHightPowerAppliance() {
        return hightPowerAppliance;
    }

    public void setHightPowerAppliance() {
        if (getPower() > 700)
            hightPowerAppliance = true;
        hightPowerAppliance = false;
    }

    @Override
    public String toString() {

        return super.toString()+"ImmutablePowerAppliance{" +
                "hightPowerAppliance=" + hightPowerAppliance +
                '}';
    }
}
