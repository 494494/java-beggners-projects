public class Main {
    public static void main(String[] arrgs){
        ComputerCase theCase=new ComputerCase("2200","Dell","240");
        Monitor theMonitor=new Monitor("27inches bease","Acer",27,"2540 x 1440");
        Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,6,"v2.44");
        PersonalComputer thePC=new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);


        //thePC.getMonitor().drawPixelAt(45,45,"red");
        //thePC.getMotherboard().loadProgram("windows OS");
        thePC.powerUp();
    }
}
