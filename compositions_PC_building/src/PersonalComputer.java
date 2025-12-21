public class PersonalComputer extends Products{
    private ComputerCase computercase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model,String manufacturer, ComputerCase computercase,
                            Monitor monitor,Motherboard mothrboard){
        super(model,manufacturer);
        this.computercase=computercase;
        this.monitor=monitor;
        this.motherboard=mothrboard;
        }
    public ComputerCase getComputerCase(){
        return computercase;
    }
    public Monitor getMonitor(){
        return monitor;
    }
    public Motherboard getMotherboard(){
        return motherboard;
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp() {
        computercase.pressPowerButton();
        drawLogo();
    }
}
