package model.applianceBuilders;


import model.entity.Appliance;
import model.entity.ImmutablePowerAppliance;
import model.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class ConcreteImmutableAppliance extends ImmutableApplianceBuilder {

    public ImmutablePowerAppliance buildToster(){
       createImmutableAppliance();
       buildName("Toster");
       buildPower(1100);
       buildRoom(Room.KITCHEN);
       return getImmutablePowerAppliance();
    }
    public ImmutablePowerAppliance buildKettle(){
        createImmutableAppliance();
        buildName("Kettle");
        buildPower(1500);
        buildRoom(Room.KITCHEN);
        return getImmutablePowerAppliance();
    }
    public ImmutablePowerAppliance buildTV(){
        createImmutableAppliance();
        buildName("TV");
        buildPower(213);
        buildRoom(Room.LIVING_ROOM);
        return getImmutablePowerAppliance();
    }

    public ImmutablePowerAppliance buildDVD(){
        createImmutableAppliance();
        buildName("DVD");
        buildPower(17);
        buildRoom(Room.LIVING_ROOM);
        return getImmutablePowerAppliance();
    }

    public ImmutablePowerAppliance buildHumidifier(){
        createImmutableAppliance();
        buildName("Humidifier");
        buildPower(350);
        buildRoom(Room.BEDROOM);
        return getImmutablePowerAppliance();
    }

    public ImmutablePowerAppliance buildRouter(){
        createImmutableAppliance();
        buildName("Router");
        buildPower(7);
        buildRoom(Room.CABINET);
        return getImmutablePowerAppliance();
    }
    public ImmutablePowerAppliance buildPrinter(){
        createImmutableAppliance();
        buildName("Printer");
        buildPower(45);
        buildRoom(Room.CABINET);
        return getImmutablePowerAppliance();
    }
    public ImmutablePowerAppliance buildComputer(){
        createImmutableAppliance();
        buildName("Computer");
        buildPower(120);
        buildRoom(Room.CABINET);
        return getImmutablePowerAppliance();
    }

    public List<ImmutablePowerAppliance> buildAllImmutableAppliance(){

        List <ImmutablePowerAppliance> allImmutableAppliance = new ArrayList<ImmutablePowerAppliance>();

        allImmutableAppliance.add(buildToster());
        allImmutableAppliance.add(buildKettle());
        allImmutableAppliance.add(buildTV());
        allImmutableAppliance.add(buildDVD());
        allImmutableAppliance.add(buildHumidifier());
        allImmutableAppliance.add(buildRouter());
        allImmutableAppliance.add(buildPrinter());
        allImmutableAppliance.add(buildComputer());

        return allImmutableAppliance;
    }


}
