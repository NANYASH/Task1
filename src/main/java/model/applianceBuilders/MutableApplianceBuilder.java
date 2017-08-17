package model.applianceBuilders;

import model.entity.MutablePowerAppliance;
import model.entity.Room;

public abstract class MutableApplianceBuilder  {

private MutablePowerAppliance mutablePowerAppliance;

    void createMutablePowerAppliance(){
        mutablePowerAppliance = new MutablePowerAppliance();
    }

    void buildName(String name){
        mutablePowerAppliance.setName(name);
    }

    void buildRoom(Room room){
        mutablePowerAppliance.setRoom(room);
    }

    void buildPower(int min,int average,int max) {
        mutablePowerAppliance.setMinPower(min);
        mutablePowerAppliance.setAveragePower(average);
        mutablePowerAppliance.setMaxPower(max);
    }

    public MutablePowerAppliance getMutablePowerAppliance() {
        return mutablePowerAppliance;
    }

    public void setMutablePowerAppliance(MutablePowerAppliance mutablePowerAppliance) {
        this.mutablePowerAppliance = mutablePowerAppliance;
    }

}
