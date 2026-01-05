import java.util.*;
public class Main{
    public static  void main(String[] args){
        String s="8 475 40 64587 100567 100 9649055 57 8225143 8 58249 2426 7698727 6 6282045 430141 818050698 25 6063 63493 844379872 7173 848 10 90729620 360 402693561";
        String[] str=s.split(" ");
        ArrayList<Integer> array=new ArrayList<>();
        for(String i:str){
            array.add(Integer.parseInt(i));
        }
        long result=0;
        for(int i:array){
            result+=i;
            result=(result*113)%10000007;
        }
        System.out.print(result);
        
    }
}
