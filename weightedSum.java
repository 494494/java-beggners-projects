public class weightedSum{
    public static void main(String[] args){
     int [] arr={657,73396, 6 ,158761278 ,227833593 ,9, 758666, 3, 2586 ,
     15609132 ,2087, 321809 ,370473541, 2026 ,3824, 2771916, 14 ,92027529, 54095701, 
     29 ,2086118, 23 ,123 ,243448207, 13 ,335, 70617, 9463, 2 ,1223 ,50725, 6314, 38412417 ,28646655 ,870014, 118966};
    
    for(int x:arr){
        System.out.print(weightedSum(x)+" ");
    }
        
    }   
    public static int digitCount(int number){
        int digit =0;
        while(number!=0){
            number=number/10;
            digit++;
        }
        return digit;
    }
    public static int weightedSum(int number){
        int sum=0;
        int place=1;
        int digitCount=digitCount(number);
        while(number!=0){
            sum+=(number/((int)Math.pow(10,(digitCount-1))))*place++;
            number%=((int) Math.pow(10,(digitCount-1)));
            digitCount--;
        }
        return sum;
    }
}
