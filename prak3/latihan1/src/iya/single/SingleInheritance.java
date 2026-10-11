class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong meong");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.makan(); // method parent
        kucing.suara(); // method child
    }
}

