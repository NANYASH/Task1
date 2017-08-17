package model;


import model.entity.Appliance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplianceApp <T extends Appliance>{

    private List<T> appliances;

    public ApplianceApp() {
        this.appliances = new ArrayList<T>();
    }

    public int getTotalPower(List<T> usedAppliance) {
        int totalPower = 0;
        for (T appliance : usedAppliance)
            if (appliance.isOn())
                totalPower+=appliance.getPower();
        return totalPower;
    }

    public int getTotalPower(List<T> usedAppliance1,List<T> usedAppliance2) {
        int totalPower = 0;

        for (T appliance : usedAppliance1)
            if (appliance.isOn())
                totalPower = +appliance.getPower();

        for (T appliance : usedAppliance2)
            if (appliance.isOn())
                totalPower = +appliance.getPower();

        return totalPower;
    }

    public  void sortByPower(List<T> usedAppliance) {
        Collections.sort(usedAppliance, new SortApplianceByPower() {
        });

    }

    public  void turnOnAppliance(List<T> usedAppliance) {
        for (T appliance : usedAppliance)
            appliance.turnOn();
    }

    public  void turnOffAppliance(List<T> usedAppliance) {
        for (T appliance : usedAppliance)
            appliance.turnOff();
    }

    public List<T> getAppliances() {
        return appliances;
    }

    public void setAppliances(List<T> appliances) {
        this.appliances = appliances;
    }
}
