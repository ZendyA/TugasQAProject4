package tugasSekolahQA4;

public class Honda extends Motor {
    int year, manufactureDiscount;
    public Honda(int speed, double regularPrice, String color, String name, int year, int manufactureDiscount) {
        super(speed, regularPrice, color, name);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;

    }
    public double getSalePrice(){
        return regularPrice-manufactureDiscount;
    }
    void tampilan1(){
        System.out.println("Honda");
        System.out.println("Nama Motor =" +" " +this.name);
        System.out.println("Manufaktur Diskon =" +" " +this.manufactureDiscount);
        System.out.println("Tahun =" +" " +this.year);
        System.out.println("Warna =" +" " +this.color);
        System.out.println("Harga =" +"" +this.regularPrice);
        System.out.println("Harga setelah Diskon =" +" " + getSalePrice());
    }
}
