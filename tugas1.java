public class tugas1 {
    static String konversi(int angka) {
        String hasil = "";

        if (angka % 3 == 0) {
            hasil += "Fizz";
        }
        if (angka % 5 == 0) {
            hasil += "Buzz";
        }
        if (hasil.isEmpty()) {
            hasil = String.valueOf(angka);
        }
        return hasil;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(konversi(i));
        }
    }
}