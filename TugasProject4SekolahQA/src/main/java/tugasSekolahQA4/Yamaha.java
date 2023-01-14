package tugasSekolahQA4;

public class Yamaha  extends Motor{
    int cubicalCentimeter;
    Yamaha(int speed, double regularPrice, String color, String name, int cubicalCentimeter) {
        super(speed, regularPrice, color, name);
        this.cubicalCentimeter = cubicalCentimeter;
    }
    public double getSalePrice(){
        return cubicalCentimeter >= 250 ? regularPrice*0.15 : regularPrice*0.1;
    }
    void tampilan3(){
        System.out.println("Yamaha");
        System.out.println("Nama Motor =" +" " +this.name);
        System.out.println("Kecepatan =" +" " + this.speed);
        System.out.println("Warna =" +" " +this.color);
        System.out.println("Kapasitas CC =" +" " +this.cubicalCentimeter);
        System.out.println("Harga =" +" " +this.regularPrice);
        System.out.println("Diskon =" +" " + getSalePrice());
    }
}
