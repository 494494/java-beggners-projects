public class SmartKitchen {

    private coffeeMaker brewmaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    public SmartKitchen(){
         this.brewmaster=new coffeeMaker();
        this.iceBox=new Refrigerator();
        this.dishWasher=new DishWasher();
    }

    public coffeeMaker getBrewmaster() {
        return brewmaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public void setKitchenState(boolean brewmasterflsg,boolean iceboxflag, boolean dishwasherflag){
        brewmaster.setHasWorkToDo(brewmasterflsg);
        iceBox.setHasWorkToDo(iceboxflag);
        dishWasher.setHasWorkToDo(dishwasherflag);
    }
    public void dokitchenwork(){
        brewmaster.addMilk();
        iceBox.addWater();
        dishWasher.loadDishes();
    }
}

class Refrigerator{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void addWater(){
        if (hasWorkToDo){
            System.out.println("Watter Added");
            this.hasWorkToDo=false;
        }
    }
}
class DishWasher{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void loadDishes(){
        if (hasWorkToDo){
            System.out.println("Dishes loaded");
            this.hasWorkToDo=false;
        }
    }
}
class coffeeMaker{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void addMilk(){
        if (hasWorkToDo){
            System.out.println("milk Added");
            this.hasWorkToDo=false;
        }
    }
}