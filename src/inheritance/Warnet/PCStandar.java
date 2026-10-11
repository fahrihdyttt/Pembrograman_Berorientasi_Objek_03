package inheritance.Warnet;

public class PCStandar extends PC {
    private int ukuranMonitor;

    public PCStandar(String idKomputer, double tarifPerJam, String processor, int ram, int ukuranMonitor) {
        super(idKomputer, tarifPerJam, processor, ram);
        this.ukuranMonitor = ukuranMonitor;
    }

    @Override
    public void displayPcDetails() {
        super.displayPcDetails();
        System.out.println("Detail PC Standar");
    }

    public void showMonitorDetails() {
        System.out.println("Ukuran Monitor  : " + ukuranMonitor + " inch");
    }
}