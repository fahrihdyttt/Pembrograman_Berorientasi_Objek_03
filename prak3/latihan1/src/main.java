import com.biodata.Mahasiswa;

public class main {
    public static void main(String[] args) {
        //ojek pertama = Remon
        Mahasiswa Remon = new Mahasiswa(
            "4525210041",
            "Remon",
            "Aqsa",
            "25 Juni 2002",
            "Jl. Cendana No.12",
            22
        );

        //objek kedua = apip
        Mahasiswa Apip = new Mahasiswa (
            "4525210042",
            "Apip",
            "Rektor",
            "10 Mei 2001",
            "Jl. Melati No.8",
            23
        );
        //tampilkan info
        Remon.displayInfo();
        Apip.displayInfo();

        //panggil method belajar dan ujian
        Remon.belajar();
        Apip.ujian();
    }
}
