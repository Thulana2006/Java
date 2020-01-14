class MyCar {
  public void Honk() {
    System.out.println("Tuuk, Tuuk!");
  }
}

class Bmw extends MyCar {
  public void Honk() {
    System.out.println("The BMW says: Pong, Pong!");
  }
}

class Audi extends MyCar {
  public void Honk() {
    System.out.println("The dog says: Peek, Peek!");
  }
}

class Polymorphism {
  public static void main(String[] args) {
    MyCar mycar = new MyCar();  // Create a MyCar object
    MyCar myBMW = new Bmw();  // Create a Bmw object
    MyCar myAudi = new Audi();  // Create a Audi object
    mycar.Honk();
    myBMW.Honk();
    myAudi.Honk();
  }
}