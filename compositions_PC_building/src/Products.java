public class Products {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;


    public Products(String model,String manufacturer){
        this.model=model;
        this.manufacturer=manufacturer;
    }
}
//Monitor
class Monitor extends Products{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer){
        super(model,manufacturer);
    }

    public Monitor(String model, String manufacturer,int size, String resolution){
        super(model,manufacturer);
        this.size=size;
        this.resolution=resolution;
    }
    public void drawPixelAt(int x, int y,String color){
        System.out.println(String.format("Drawing pixel at %d %d in color %s",x,y,color));
    }
}
//Motherboard
class Motherboard extends Products{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer){
        super(model,manufacturer);
    }
    public Motherboard(String model, String manufacturer, int ramSlots,int cardSlots,String bios){
        super(model,manufacturer);
        this.bios=bios;
        this.cardSlots=cardSlots;
        this.ramSlots=ramSlots;
    }
    public void loadProgram(String programName){
        System.out.println("program"+programName+" is now loading..");
    }
}
//ComputerCase
class ComputerCase extends Products{
    private String powerSupply;

    public ComputerCase(String model,String manufacturer){
        super(model,manufacturer);
    }

    public ComputerCase(String model,String manufacturer, String powerSupply){
        super(model,manufacturer);
        this.powerSupply=powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power button presed");
    }
}