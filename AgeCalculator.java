import java.util.Scanner;
public class AgeCalculator {
    static Scanner lol = new Scanner(System.in);
    public static void main(String[] arr ){
        try {
            System.out.println(consolMethod());
        }catch (Exception e){
            System.out.println(ScannerMethod());
        }
    }
    public static String consolMethod() {
        String ss = System.console().readLine("what is your name  ");
        System.out.println("Hello " + ss);
        String year;
        do {
            year = System.console().readLine("what is your birth year  ");
        } while (Integer.parseInt(year)>2025 || Integer.parseInt(year)<1900);
        return ("Age = " + (2025 - Integer.parseInt(year)));
    }

    public static String ScannerMethod(){
        System.out.println("what is your name  ");
        String ss= lol.nextLine();
        String year;
        System.out.println("Hello " + ss + " what is your birth year  ");
        do {
             year = lol.nextLine();
             if(Integer.parseInt(year)>2025 || Integer.parseInt(year)<1900){
                 System.out.println("invalid birth year please re-enter ");
             }
        }while (Integer.parseInt(year)>2025 || Integer.parseInt(year)<1900);
        return ("Age = "+ (2025-Integer.parseInt(year))) ;
    }
}
