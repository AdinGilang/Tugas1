public class Nilai {

    String NIM;
    String NAMA;
    float nilaiabsen;
    float nilaitugas;
    float nilaiuts;
    float nilaiuas;
    float NilaiAkhir;

    float nilai() {
        NilaiAkhir = (nilaiabsen * 10/100) + (nilaitugas * 20/100) + (nilaiuts * 30/100) + (nilaiuas * 40/100);
        return NilaiAkhir;

    }

    void CetakNilai () {
        System.out.println("NIM" +NIM);
        System.out.println("NAMA " +NAMA);
        System.out.println("Nilai Absen[10%]"+nilaiabsen);
        System.out.println("Nilai Tugas[20%]"+nilaitugas);
        System.out.println("Nilai UTS [30%]"+nilaiuts);
        System.out.println("Nilai UAS[40%]"+nilaiuas);
        System.out.println("Nilai Akhir"+nilai());
    }

}