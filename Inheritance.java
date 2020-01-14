public class Inheritance extends Vehicle {

    String model="i8";
    
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.Honk();
        
        System.out.println(obj.brand);
    }
    
}
class Vehicle{
    protected String brand="BMW";
    
    protected void Honk(){
        System.out.println("pong, pong!");
    }
}

