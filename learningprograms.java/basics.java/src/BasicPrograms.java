import java.util.Scanner;

public class BasicPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take two numbers and print the sum of the both..
        /*
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers : " + sum);
        */

        //Take a number as input and print the multiplication table for it..
        /*
        int num = sc.nextInt();
        int count = 1;
        while(count < 11){
            System.out.println( num + "*" + count +"=" + num * count);
            count++;
        }
        */

        //Keep taking numbers as inputs till the user enters 'x', after that print sum of all..
        /*
        int sum = 0;
        boolean val = true;
        while(val){
            int num = sc.nextInt();
            if(num == 10){
                val = false;
                break;
            }
            sum += num;
        }
        System.out.println("The sum of numbers : " + sum);
        */

        //Find the given number is prime or not..
        /*
        int num = sc.nextInt();
        int check = 2;
        while(check < num){
            if(num % check == 0) {
                System.out.println("Not Prime");
                return;
            }
            check = check + 1;
        }
        System.out.println("Prime");
        */
    }
}
