package tugasSekolahQA4;

public class CilsyAutoShop {
    public static void main(String[] args) {
        Honda honda1;
        honda1 = new Honda(100,1000, "Hitam", "PCX 160", 2022, 50);
        honda1.tampilan1();

        System.out.println();

        Harley harley1;
        harley1 = new Harley(200, 1500, "Putih", "Sportster S", 300);
        harley1.tampilan2();

        System.out.println();

        Yamaha yamaha1 = new Yamaha(210, 500, "Biru Metallic", "Mio R15", 400);
        yamaha1.tampilan3();
    }
}
