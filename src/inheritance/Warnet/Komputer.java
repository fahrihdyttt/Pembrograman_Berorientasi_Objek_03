package inheritance.Warnet;

public class Komputer {
    private String idKomputer;
    private double tarifPerJam;

    public Komputer(String idKomputer, double tarifPerJam) {
        this.idKomputer = idKomputer;
        this.tarifPerJam = tarifPerJam;
    }

    public void displayInfo() {
        System.out.println("ID Komputer     : " + idKomputer);
        System.out.println("Tarif per Jam   : " + tarifPerJam);
    }
}