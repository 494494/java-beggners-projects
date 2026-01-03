public class Car {
    private String description;
    public Car(String a){
        this.description=a;
    }
    public void startEngine(){
        System.out.println("Car -> startEngine");
    }
    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
    public void drive(){
        runEngine();
        System.out.println("Car -> driving, of type "+getClass().getSimpleName());
    }
}
class GasPoweredCar extends Car{
    private double avgKmPerCharge;
    int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerCharge, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("ALL %d cylinders are fired ,Ready!!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usages exceeds the %.2f %n",avgKmPerCharge);
    }

}
class EV extends Car{
    private double avgKmPerCharge;
    int batteries;

    public EV(String description) {

        super(description);
    }

    public EV(String description, double avgKmPerCharge, int batteries) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batteries = batteries;
    }

    @Override
    public void startEngine() {
        System.out.printf("ALL %d batteries are charged ,Ready!!%n",batteries);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Batteries -> usages exceeds the %.2f %n",avgKmPerCharge);
    }
}
class HybridCar extends Car{
    private double avgKmPerCharge;
    int cylinders;
    int batteries;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int cylinders,int batteries) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
        this.batteries=batteries;
    }

    @Override
    public void startEngine() {
        System.out.printf("ALL %d cylinders are fired ,Ready!!\tAll %d Batteries are ready",cylinders,batteries);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas,batteries -> usages exceeds the %.2f \n",avgKmPerCharge);
    }

}
