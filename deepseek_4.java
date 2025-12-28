import java.util.Scanner;
public class deepseek_4 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("your word = ");
        String str=sc.nextLine();
        String strf=str.toLowerCase();
        if(isit(strf)){
            System.out.println(str +" = palindrome");
        }
        else{
            System.out.println(str +" = not");
        }
        sc.close();
    }
    private static boolean isit(String arg){
        int left=0;
        int right=arg.length()-1;
        while(left<right){
            if(arg.charAt(left)!=arg.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
