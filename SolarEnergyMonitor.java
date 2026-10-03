public class SolarEnergyMonitor {
    public static void main(String[] args) {
        int panelId = 101;
        double energyGenerated = 42.50;
        int numberOfPanels = 16;
        char systemStatus = 'A';
        System.out.println("=== Rooftop Solar System Monitor ===");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}