import java.util.Scanner;
public class StrongPass {
    public static String passcheck(String p){
        int score=0;

        if(p.length()>=8) score++;
        boolean hasUppercase=false;
        boolean haslowercase=false;
        boolean hasDigits=false;
        boolean hasSpecialchar=false;

        char[] ch=p.toCharArray();
        for(char c:ch){
           if(Character.isUpperCase(c)) hasUppercase=true;
           if(Character.isLowerCase(c)) haslowercase=true;
           if(Character.isDigit(c)) hasDigits=true;
           if("!@#$%^&*_.".contains(String.valueOf(c))) hasSpecialchar=true;
        }
        if(haslowercase) score++;
        if (hasDigits) score++;
        if (hasSpecialchar) score++;
        if(hasUppercase) score++;
        // Build feedback
        StringBuilder feedback= new StringBuilder();
        if(p.length()<8) feedback.append("⚠ password must contain more than 8 character.\n");
        if(!haslowercase ) feedback.append("⚠ Add at least one lowercase letter.\n");
        if (!hasDigits) feedback.append("⚠ Add at least one Digit letter.\n");
        if (!hasSpecialchar) feedback.append("⚠ Add at least one special character.\n");
        if(!hasUppercase) feedback.append("⚠ Add at least one uppercase letter.\n");
        //
        if(score==5) return " ✅ Strong password\n" + feedback;
        if(score>=2 && score<5 ) return "medium strong password\n" + feedback;
        if(score<2) return "weak password\n" + feedback;
        return feedback.toString();
    }
    public static void main(String[] ss){
        Scanner sc= new Scanner(System.in);
        String p= sc.nextLine();
        System.out.println(passcheck(p));
    }
}