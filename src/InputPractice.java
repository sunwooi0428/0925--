import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int b = sc.nextInt();

        System.out.print("연산자를 입력하시오 : ");
        char op = sc.next().charAt(0);

        if( op=='+') {
            System.out.println( a+" + "+b+" = "+(a+b) );
        }
        else if( op=='-') {
            System.out.println( a+" - "+b+" = "+(a-b) );
        }
        else if( op=='*') {
            System.out.println( a+" * "+b+" = "+(a*b) );
        }
        else if( op=='/') {
            System.out.println( a+" / "+b+" = "+(a/b) );
        }
        else {
            System.out.println("사칙연산자가 아닙니다.");
        }
    }
}