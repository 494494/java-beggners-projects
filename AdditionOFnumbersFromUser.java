import java.util.Scanner;
public class AdditionOFnumbersFromUser {
    static Scanner  scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int i=1,sum=0;
        do{
            System.out.print("Enter your #"+i+ " :- ");
            try{String ss=scanner.nextLine();
                sum+=Integer.parseInt(ss);
                i++;
            } catch (NumberFormatException e) {
                System.out.println("invalid input please re-enter");
                continue;
            }
        }while(i<6);
        System.out.println(sum);
    }
}
