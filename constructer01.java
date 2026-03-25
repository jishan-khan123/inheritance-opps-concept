class scorpio{
    int speed;
    String name;
    String color;
    int model;
    
    
    
    void dislay1(){
        System.out.println(" speed :" + speed);
        System.out.println(" name :" + name);
        System.out.println(" color :" + color);
        System.out.println(" model :" + model);
    }
}
    public class constructer01 {
     public static void main(String[] args) {
        
    scorpio  car1  = new scorpio();// its object

    System.out.println("this is cars property & details");
        car1.speed = 25;
        car1.color = "red"; 
        car1.name = "fortuner , zaquar |";
        car1.model = 2025;
        car1.dislay1();



























    }
}
