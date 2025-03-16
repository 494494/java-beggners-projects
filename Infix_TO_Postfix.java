import java.util.Scanner;

class Infix_TO_Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("infix eq == ");
        String p = sc.nextLine();
//        System.out.println(p);
//        System.out.println(p.length());
        char[] z = ReturnArray(p);
//        System.out.print("symbol array == ");
//        printArray(z);
        char[] finalOut = createpostfix(z);
        System.out.print("postfix eq == ");
        printArray(finalOut);
        sc.close();
    }

    public static char[] createpostfix(char[] a) {
        char[] postfix = new char[a.length];
        char[] stack = new char[a.length];
        int post = 0, top = 0;
        for (char x : a) {
            if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
                postfix[post++] = x;
//                System.out.print(post);
            } else if (x == '(') {
                stack[top++] = x;
            } else if (x == ')') {
                while (top>0 && stack[top-1] != '(') {
                    postfix[post++] = stack[--top];
                }
                top--;
            } else if (x =='+'|| x=='-'||x=='*'|| x=='/'||x=='^') {
                while(top>0 && precidency(stack[top-1])>=precidency(x)){
                    postfix[post++]=stack[--top];
                }
                    stack[top++]=x;
            }
        }
        while(top>0 && stack[top-1]!='('){
            postfix[post++]=stack[--top];
        }

        char[] finalpostfix= new char[post];
        for(int i=0;i<post;i++){
            finalpostfix[i]=postfix[i];
        }
        return finalpostfix;
    }


    public static int precidency(char a) {
        switch (a) {
            case ('('):
                return 0;
            case ('-'):
            case ('+'):
                return 1;
            case ('*'):
            case ('/'):
                return 2;
            case ('^'):
                return 3;
            case (')'):
                return 4;
            default:
                return -1;
        }
    }

    public static char[] ReturnArray(String a) {
        char[] arr = new char[a.length()+2];
        arr[0]='(';
        for (int i = 0; i <a.length(); i++) {
            arr[i+1] = a.charAt(i);
        }
        arr[a.length()+1]=')';
        return arr;
    }

    public static void printArray(char[] a) {
        for (char x : a) {
            System.out.print(x);
        }
    }
}