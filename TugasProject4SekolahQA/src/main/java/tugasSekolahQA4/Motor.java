package tugasSekolahQA4;

public class Motor {
    int speed;
    double regularPrice, getSalePrice;
    String color, name;

    Motor(int speed, double regularPrice, String color, String name){
        this.color = color;
        this.speed = speed;
        this.regularPrice= regularPrice;
        this.name = name;
    }
    public double getSalePrice(){
        return getSalePrice;
    }
}
