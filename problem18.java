import java.util.*;
public class Main{
    
    public static ArrayList<cal> object=new ArrayList<>();
    
    public static void main(String[] args){
       String s = """
971 2
8470 13
12 12
310 5
4945 12
5168 11
65605 1
43415 12
55 2
31 3
57 13
89599 12
""";

        
        String[] a=s.split("\\R");
                    
        for(String i:a){
            String[] z=i.split(" ");
            object.add(new cal(Integer.parseInt(z[0]),Integer.parseInt(z[1])));
        }
        for(cal o:object){
            double p=o.calculation();
            System.out.printf("%.7f ",p);
        }
    }
}
class cal{
    public double x;
    public int numberOfSteps;
    public double r=1;
    public cal(long x,int numberOfSteps){
        this.x=x;
        this.numberOfSteps=numberOfSteps;
    }
    public double calculation(){
        while(this.numberOfSteps>0){
            this.r=(this.r+x/this.r)/2;
            numberOfSteps--;
        }
        return this.r;
    }
}
