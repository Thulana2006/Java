public class Encapsulation {

    private int pswd;
    private String name;
    private int age;
    
    public int getPswd(){
        return pswd;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPswd(int newPswd){
        pswd = newPswd;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public void setName(String newName){
        name = newName;
    }

    public static void main(String[] args) {
        
        Encapsulation obj = new Encapsulation();
        obj.setAge(13);
        obj.setName("Thulana");
        obj.setPswd(1234);
        
        System.out.println("Your name is : " + obj.getName());
        System.out.println("Your age is : " + obj.getAge());
        System.out.println("Your password is : " + obj.getPswd());
    }
    
}
