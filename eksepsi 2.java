public class Main {
    static void cekUmur(int umur) {
        if (umur < 18) {
            throw new ArithmeticException("Akses ditolak - Anda setidaknya harus berumur lebih dari 18 tahun");
        } 
        else {
            System.out.println("Akses diterima - Anda sudah cukup umur");
        }
    }

    public static void main(String[] args) {
        cekUmur(15); // Mengatur umur ke 15 (dibawah 18...)
    }
}