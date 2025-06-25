import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
//        System.out.println(str);
        StringBuilder strNew = new StringBuilder(str);

       String revStr =  strNew.reverse().toString();

       if(str.equals(revStr)){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not Palindrome");
       }
    }
}
