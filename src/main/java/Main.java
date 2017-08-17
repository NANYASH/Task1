
import model.ApplianceApp;
import model.applianceBuilders.ConcreteImmutableAppliance;


public class Main {
    public static void main(String[] args) {
        ApplianceApp applianceApp = new ApplianceApp();
        ConcreteImmutableAppliance concreteImmutableAppliance = new ConcreteImmutableAppliance();

        applianceApp.getAppliances().addAll(concreteImmutableAppliance.buildAllImmutableAppliance());

        System.out.println(applianceApp.getAppliances().toString());

        applianceApp.turnOnAppliance(applianceApp.getAppliances());

        System.out.println(applianceApp.getTotalPower(applianceApp.getAppliances()));

        applianceApp.sortByPower(applianceApp.getAppliances());

        System.out.println(applianceApp.getAppliances().toString());
    }
}
