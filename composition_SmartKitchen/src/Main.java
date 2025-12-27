public class Main {
    public static void main(String [] r){
        SmartKitchen kitchen=new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewmaster().setHasWorkToDo(true);
//
//        kitchen.getBrewmaster().addMilk();
//        kitchen.getDishWasher().loadDishes();
//        kitchen.getIceBox().addWater();
        kitchen.setKitchenState(true ,true,false);
        kitchen.dokitchenwork();
    }
}
