import java.util.Scanner;
public class factorial_using_recurssion {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        char y='y';
        while(y=='y'||y=='Y'){
        System.out.print("enter number to find its factorial =");
        int n=sc.nextInt();
        System.out.print("factorial = "+ fac(n)+"\n");
        System.out.print("restart Y/N = ");
        y=sc.next().charAt(0);
        }
        sc.close();
    }

private static int fac(int n){
    if(n==0||n==1)
    return 1;
    return n*fac(n-1);
}
}