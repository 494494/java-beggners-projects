import java.util.Scanner;

public class deepseek_2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter your number else enter -1 to exit = ");
            int a = sc.nextInt();
            if (a == -1)
                break;
            if (isPrime(a)) {
                System.out.println(a + " = prime");
            } else {
                System.out.println(a + " = not prime");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int a) {
        if (a < 2)
            return false;
        for (int i = 2; (i * i) <= a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}