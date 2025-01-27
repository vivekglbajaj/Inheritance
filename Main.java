 class Vihicle {
protected String brand;
protected int speed;
    Vihicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }
}

 class Car extends Vihicle{
    Car(String brand,int speed){
        super(brand,speed);
    }
    public void ApplyBrake(){
        speed-=5;
        System.out.println("Speed after applying brake: "+speed);
    }
    
}
class Bike extends Vihicle{
    Bike(String brand,int speed){
        super(brand,speed);
    }
    public void Kickstart(){
        
        System.out.println("Bike is started");
    }
}
public class Main{
    public static void main(String[] args) {
        Car car=new Car("BMW",100);
        car.display();
        car.ApplyBrake();
        
        Bike bike=new Bike("Yamaha",60);
        bike.display();
        bike.Kickstart();
    }
}