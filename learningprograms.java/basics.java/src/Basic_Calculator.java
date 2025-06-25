import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
//        String symbol = sc.next();
        char c = sc.next().trim().charAt(0);
        int num2 = sc.nextInt();

        switch(c){
            case '+':
                System.out.println("Addition of both : " + (num1 + num2));
                break;

            case '-':
                System.out.println("Addition of both : " + (num1 - num2));
                break;

            case '*':
                System.out.println("Addition of both : " + (num1 * num2));
                break;

            case '/':
                System.out.println("Addition of both : " + (num1 / num2));
                break;

            case '%':

                System.out.println("Addition of both : " + (num1 % num2));
                break;

            default:
                System.out.println("Please enter valid num or symbol..");
        }


    }
}

