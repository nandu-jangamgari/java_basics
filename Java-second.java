import java.util.Scanner;

public class Sum{
    public static void main(String[] args){

        Scanner input = new Scanner();

        System.out.println("enter your number 1 :");
        double num1 = input.nextDouble();

        System.out.println("enter your number 2 :");
        double num2 = input.nextDouble();

        System.out.println("+,*,-,/");
        char sign= input.next().charAt(0);

        double result;

        switch(sign) {

            case '+':

                result = num1 + num2;
                System.out.println(result);

            case '-':

                result = num1 - num2;
                System.out.println(result);

            case '*':

                result = num1 * num2;
                System.out.println(result);

            case '/':


                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(result);
                } else {
                    System.out.println("error");

                }
                break;
            default:
                System.out.println("not performed");


        }



    }
}