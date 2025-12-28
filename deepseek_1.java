import java.util.Scanner;
public class deepseek_1 {
    public static void main(String[] arg){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Fizz number =");
        int a= scanner.nextInt();
        System.out.print("Buzz number =");
        int b = scanner.nextInt();
        for(int i=1;i<=100;i++){
            if (i%a==0 && i%b==0) {
                System.out.println("FizzBuzz");
            }
            else if (i%a==0){
                System.out.println("Fizz");
            }
            else if(i%b==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        scanner.close();
    }
}