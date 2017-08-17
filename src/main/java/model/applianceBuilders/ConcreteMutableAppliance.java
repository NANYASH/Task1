package model.applianceBuilders;

import model.entity.MutablePowerAppliance;
import model.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMutableAppliance extends MutableApplianceBuilder {

    public MutablePowerAppliance buildRefrigerator() {
        createMutablePowerAppliance();
        buildName("Refrigerator");
        buildPower(100, 150, 200);
        buildRoom(Room.KITCHEN);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildOven() {
        createMutablePowerAppliance();
        buildName("Oven");
        buildPower(10000, 13610, 17221);
        buildRoom(Room.KITCHEN);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildBlender() {
        createMutablePowerAppliance();
        buildName("Blender");
        buildPower(200, 250, 300);
        buildRoom(Room.KITCHEN);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildJuicer() {
        createMutablePowerAppliance();
        buildName("Juicer");
        buildPower(300, 450, 600);
        buildRoom(Room.KITCHEN);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildWashingMachine() {
        createMutablePowerAppliance();
        buildName("Washing Machine");
        buildPower(1500, 2200, 2500);
        buildRoom(Room.BATHROOM);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildHairDryer() {
        createMutablePowerAppliance();
        buildName("Hair Dryer");
        buildPower(1200, 1500, 1800);
        buildRoom(Room.BATHROOM);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildDryingMachine() {
        createMutablePowerAppliance();
        buildName("Drying Machine");
        buildPower(2000, 2800, 3400);
        buildRoom(Room.BATHROOM);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildAirConditioning() {
        createMutablePowerAppliance();
        buildName("Air Conditioning");
        buildPower(1500, 2300, 3000);
        buildRoom(Room.LIVING_ROOM);
        return getMutablePowerAppliance();
    }

    public MutablePowerAppliance buildStereoSystem() {
        createMutablePowerAppliance();
        buildName("Stereo System");
        buildPower(30, 40, 60);
        buildRoom(Room.LIVING_ROOM);
        return getMutablePowerAppliance();
    }

    public List<MutablePowerAppliance> buildAllMmutableAppliance() {

        List<MutablePowerAppliance> allMutableAppliance = new ArrayList<MutablePowerAppliance>();

        allMutableAppliance.add(buildRefrigerator());
        allMutableAppliance.add(buildOven());
        allMutableAppliance.add(buildBlender());
        allMutableAppliance.add(buildJuicer());
        allMutableAppliance.add(buildWashingMachine());
        allMutableAppliance.add(buildHairDryer());
        allMutableAppliance.add(buildDryingMachine());
        allMutableAppliance.add(buildAirConditioning());
        allMutableAppliance.add(buildStereoSystem());

        return allMutableAppliance;

    }

}


