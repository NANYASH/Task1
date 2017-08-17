package view;

public class ConsoleView {

    public static final String TURN_ON = "Turn On";
    public static final String APPLIANCE_ON = "Appliance is already On!";
    public static final String TURN_OFF = "Turn Off";
    public static final String APPLIANCE_OFF = "Appliance is alreadyOff";
    public static final String APPLIANCE_INFORMATION = "Appliance information:";
    public static final String IMMUTABLE_APPLIANCE_INFORMATION = "This appliance is immutable.";
    public static final String MUTABLE_APPLIANCE_INFORMATION = "This appliance is mutable.";
    public static final String WARNING = "Appliance is not On!Please,turn on your appliance!";
    public static final String MAX_SET = "Max power was set";
    public static final String AVERAGE_SET = "Average power was set";
    public static final String MIN_SET = "Min power was set";
    public static final String INCORECT_DATA = "Incorect data!Please,try again!";
    public static final String MENU = "All available appliance, choose appliances which you want to turn on :" +
            "Toster press : 0" +
            "Kettle : 1" +
            "Tv : 2" +
            "DVD : 3" +
            "Humidifier : 4" +
            "Router : 5" +
            "Printer : 6" +
            "Computer : 7" +
            "Refrigerator : 8" +
            "Oven : 9" +
            "Blender : 10" +
            "Juicer : 11" +
            "Washing Machine : 12" +
            "Hair Dryer : 13" +
            "Drying Machine : 14" +
            "Air Conditioning : 15" +
            "Stereo System : 16";
    public static final String MENU2 = "All turn on appliance:";
    public static final String MENU3 = "All turn off appliance:";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String message1, String message2) {
        System.out.println(message1 + message2);
    }
}
