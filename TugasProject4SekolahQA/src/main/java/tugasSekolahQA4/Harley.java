package tugasSekolahQA4;

public class Harley extends Motor{
    int weight;
    Harley(int speed, double regularPrice, String color, String name, int weight) {
        super(speed, regularPrice, color, name);
        this.weight = weight;
    }
    public double getSalePrice(){
        return weight >= 250 ? regularPrice*0.15 : regularPrice*0.1;
    }
    void tampilan2(){
        System.out.println("Harley Davidson");
        System.out.println("Nama Motor =" +" " +this.name);
        System.out.println("Kecepatan =" +" " + this.speed);
        System.out.println("Warna =" +" " +this.color);
        System.out.println("Berat =" +" " +this.weight);
        System.out.println("Harga =" +" " +this.regularPrice);
        System.out.println("Diskon =" +" " + getSalePrice());
    }
}
