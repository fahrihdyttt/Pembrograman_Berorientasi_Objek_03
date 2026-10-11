
class Karyawan {
    double gaji = 5000000;

    void infoGaji() {
        System.out.println("Gaji pokok: " + gaji);
    }
}

class Programmer extends Karyawan {
    double bonus = 1000000;

    void infoBonus() {
        System.out.println("Bonus: " + bonus);
    }
}

class SeniorProgrammer extends Programmer {
    double tunjangan = 2000000;

    void totalGaji() {
        double total = gaji + bonus + tunjangan;
        System.out.println("Total gaji: " + total);
    }

    void infolengkapi() {
        infoGaji();
        infoBonus();
        System.out.println("Tunjangan: " + tunjangan);
        totalGaji();
    }
}

public class multilevel {
    public static void main(String[] args) {
        SeniorProgrammer sp = new SeniorProgrammer();
        sp.infolengkapi();
    }
}