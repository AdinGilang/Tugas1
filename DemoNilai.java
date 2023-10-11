public class DemoNilai {

    public static void main(String[] args){

        Nilai nMahasiswa = new Nilai();
        nMahasiswa.NIM = "2210631170027";
        nMahasiswa.NAMA = "Azizi Shafa Asadel";
        nMahasiswa.nilaiabsen = (float) 99;
        nMahasiswa.nilaitugas = (float) 99;
        nMahasiswa.nilaiuts = (float) 99;
        nMahasiswa.nilaiuas = (float) 99;
        nMahasiswa.CetakNilai();
    }
}