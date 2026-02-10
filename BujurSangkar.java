package Latihan01;

public class BujurSangkar extends bidangDuaDimensi{
    private double sisi;

    public BujurSangkar(String nama, double sisi){
        super(nama);
        this.sisi = sisi;
    }
    @Override
    public double luas(){
        return sisi * sisi;
    }
}
