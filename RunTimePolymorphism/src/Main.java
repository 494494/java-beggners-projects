public class Main {
    public static void main(String[] args) {
        Car car=new Car("car");
        runRace(car);
        var car2=new GasPoweredCar("car2",22,3);
        runRace(car2);
        var car3=new EV("car3",10,200);
        runRace(car3);
        var car4=new HybridCar("car3",10,200,4);
        runRace(car4);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}
