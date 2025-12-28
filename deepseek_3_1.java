import java.util.Scanner;

public class deepseek_3_1{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        char y = 'y';
        while (y == 'y' || y == 'Y') {
            System.out.print("factorial of?? =");
            int a = sc.nextInt(), b = 1;
            if (a == 0) {
                System.out.println("factorial = " + 1);
            } else {
                for (int i = 1; i <= a; i++) {
                    b *= i;
                }
                System.out.println("factorial = " + b);
            }
            System.out.print("restart Y/N =");
            y = sc.next().charAt(0);
        }
        sc.close();
    }
}
