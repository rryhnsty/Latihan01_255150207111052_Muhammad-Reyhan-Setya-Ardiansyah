package Latihan01;

public class Lingkaran extends bidangDuaDimensi {
    private double r;

    public Lingkaran(String nama, double r){
        super(nama);
        this.r = r;
    }
    @Override
    public double luas(){
        return Math.PI * r * r;
    }
}
