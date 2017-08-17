package model.applianceBuilders;

import model.entity.ImmutablePowerAppliance;
import model.entity.Room;

public abstract class ImmutableApplianceBuilder {

private ImmutablePowerAppliance immutablePowerAppliance;

    void createImmutableAppliance(){
        immutablePowerAppliance = new ImmutablePowerAppliance();
    }

    void buildName(String name){
        immutablePowerAppliance.setName(name);
    }

    void buildRoom(Room room){
        immutablePowerAppliance.setRoom(room);
    }

    void buildPower(int power){
    immutablePowerAppliance.setPower(power);
    immutablePowerAppliance.setHightPowerAppliance();
    }

    public ImmutablePowerAppliance getImmutablePowerAppliance() {
        return immutablePowerAppliance;
    }

    public void setImmutablePowerAppliance(ImmutablePowerAppliance immutablePowerAppliance) {
        this.immutablePowerAppliance = immutablePowerAppliance;
    }

}
