package model;

import model.entity.Appliance;

import java.util.Comparator;

public class SortApplianceByPower implements Comparator<Appliance> {

    public int compare(Appliance o1, Appliance o2) {
        return o1.getPower()-o2.getPower();
    }
}
