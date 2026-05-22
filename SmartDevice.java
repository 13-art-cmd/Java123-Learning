


public interface SmartDevice{
    final String Brand_Name = "HomeShield";
    void turnOn();
    void turnOff();
}


interface AdjustableDevice extends SmartDevice{
    void setLevel(int level);
}

class SmartLight implements AdjustableDevice{              //What will happen if we make the class as abstract class
    private int brightness;
    @Override
    public void turnOn(){
        System.out.println("HomeShield light is on");
    }
    @Override
    public void turnOff(){
        System.out.println("HomeShield light is off");
    }
    @Override
    public void setLevel(int level){
        System.out.println("The level is set to: " + level);
    }

    public static void main(String[] args){
        SmartLight Lamp = new SmartLight();
        Lamp.brightness = 81;
        Lamp.turnOn();
        Lamp.turnOff();
        Lamp.setLevel(Lamp.brightness);

    }
}