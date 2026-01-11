import java.util.LinkedList;

record Places(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}

public class main {
    public static void main(String[] args) {
        LinkedList<Places> list=new LinkedList<>();
        Places nanded=new Places("Nanded",45);
        addPlace(list,nanded);
//        addPlace(list,nanded);
        addPlace(list,new Places("naigaon",0));
        addPlace(list,new Places("sambhajinagar",300));
        addPlace(list,new Places("Pune",418));
        System.out.println(list);

    }
    public static void addPlace(LinkedList<Places> list,Places place){
        if(list.contains(place)){
            System.out.println("Found Duplicate "+ place);
            return;
        }
        for(Places p:list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found Duplicate "+ place);
                return;
            }
        }

        int indexMatch=0;
        for(Places p:list){
            if(place.distance()<p.distance()){
                list.add(indexMatch,place);
                return;
            }
            indexMatch++;
        }
        list.add(place);
    }
}
