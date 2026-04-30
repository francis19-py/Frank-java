class car{
    String brand;
    int speed;

    void drive(){
        System.out.println(brand + " is moving at" + speed + " km/h");
    }
}

public class object{
    public static void main(String[] args){
        car c = new car();
        c.brand = "toyota";
        c.speed =100;

        c.drive();
    }
}
