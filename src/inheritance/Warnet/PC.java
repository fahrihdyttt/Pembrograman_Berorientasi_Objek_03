package inheritance.Warnet;

public class PC extends Komputer {
    private String processor;
    private int ram;

    public PC(String idKomputer, double tarifPerJam, String processor, int ram) {
        super(idKomputer, tarifPerJam);
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Info dasar dari Komputer");
    }

    public void displayPcDetails() {
        System.out.println("Processor       : " + processor);
        System.out.println("RAM             : " + ram + " GB");
    }
}