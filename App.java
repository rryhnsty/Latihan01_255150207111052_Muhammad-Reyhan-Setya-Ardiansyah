package Latihan01;

public class App {
    public static void main(String[] args) {
        BujurSangkar busang = new BujurSangkar("Bujur Sangkar", 15);
        busang.info();
        System.out.println("Luas Bujur Sangkar: "+busang.luas());

        Lingkaran lingkar = new Lingkaran("Lingkaran", 14);
        lingkar.info();
        System.out.println("Luas Lingkaran: "+lingkar.luas());
    }
    
}
