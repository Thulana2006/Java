// Abstract class

abstract class Car {

  // Abstract method (does not have a body)

  public abstract void Honk();

  // Regular method

  public void start() {
    System.out.println("Rrr, Rrr, Rrr!");
  }
}

// Subclass (inherit from Car)

class Bmw extends Car {
  public void Honk() {

    // The body of Honk() is provided here

    System.out.println("The BMW says: Pong, pong!");
  }
}

public class Abstraction {
    public static void main(String[] args) {
        
    Bmw myBmw = new Bmw(); // Create a Bmw object
    myBmw.Honk();
    myBmw.start();
    }
    
}


