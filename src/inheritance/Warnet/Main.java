package inheritance.Warnet;

public class Main {
    public static void main(String[] args) {
        PCStandar pcStandar = new PCStandar("PC-01", 5000, "Rayzen 5", 8, 19);

        System.out.println("=== PC Standar ===");
        pcStandar.displayInfo();
        pcStandar.displayPcDetails();
        pcStandar.showMonitorDetails();

        System.out.println();

        PCVIP pcVip = new PCVIP("PC-02", 10000, "Rayzen 7", 16, "Kursi Gaming");

        System.out.println("=== PC VIP ===");
        pcVip.displayInfo();
        pcVip.displayPcDetails();
        pcVip.showFasilitasDetails();
    }
}