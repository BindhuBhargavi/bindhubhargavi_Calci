import java.util.*;
class main extends operation
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        operation opr = new operation();
        System.out.println("enter number1");
        int a = sc.nextInt();
        System.out.println("enter number2");
        int b = sc.nextInt();
        System.out.println("Enter your choice:");
        System.out.println("+  -  *  /");
        char op = sc.next().charAt(0);
        if (op == '+') {
            opr.addition(a, b);
        } else if (op == '-') {
            opr.subtraction(a, b);
        } else if (op == '*') {
            opr.multiply(a, b);
        } else if (op == '/') {
            opr.division(a, b);
        }
    }
}
