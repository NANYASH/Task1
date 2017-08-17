package model.entity;

import view.ConsoleView;

public abstract class Appliance {

    private String name;
    private int power;
    private Room room;
    private boolean isOn;

    public Appliance() {
    }

    public Appliance(String name, int power, Room room, boolean isOn) {
        this.name = name;
        this.power = power;
        this.room = room;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (isOn != true) {
            isOn = true;
            ConsoleView.printMessage(ConsoleView.TURN_ON);
        } else {
        ConsoleView.printMessage(ConsoleView.APPLIANCE_ON);}
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
            ConsoleView.printMessage(ConsoleView.TURN_OFF);
        }else {
        ConsoleView.printMessage(ConsoleView.APPLIANCE_OFF);}
    }

    void getApplianceInformation(){
        ConsoleView.printMessage(ConsoleView.APPLIANCE_INFORMATION,toString());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public boolean isOn() {
        return isOn;
    }
    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", room=" + room +
                ", isOn=" + isOn +
                '}';
    }
}
