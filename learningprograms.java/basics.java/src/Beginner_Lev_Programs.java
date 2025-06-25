import java.util.Scanner;

public class Beginner_Lev_Programs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //A program to find given number is odd or not..
        /*
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
         */

        //Take a name and print a greeting message for that..
        /*
        String name = sc.next();
        System.out.println("Hello "+name+"!, " + "Welcome to Virtual World");
        */

        //Take two numbers and print the largest number..
        /*
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
         */

        //Find the largest of three numbers...
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(num, Math.max(num2, num3));

        System.out.println(max);


    }
}
