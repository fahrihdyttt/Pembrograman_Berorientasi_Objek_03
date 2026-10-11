package inheritance.Warnet;

public class PCVIP extends PC {
    private String jenisKursi;

    public PCVIP(String idKomputer, double tarifPerJam, String processor, int ram, String jenisKursi) {
        super(idKomputer, tarifPerJam, processor, ram);
        this.jenisKursi = jenisKursi;
    }

    @Override
    public void displayPcDetails() {
        super.displayPcDetails();
        System.out.println("Detail PC VIP");
    }

    public void showFasilitasDetails() {
        System.out.println("Jenis Kursi     : " + jenisKursi);
    }
}