import java.util.Scanner;

public class Divisionx {
    public static void main(String[] args){
        Scanner mynumber = new Scanner (System.in) ;

        System.out.print("enter num1");
        int number1 = mynumber.nextInt();

        System.out.print("enter num2");
        int number2 = mynumber.nextInt();

        int divide = number1/number2;
        System.out.println(divide);

        double pointsvalue=(double)number1/number2;
        System.out.print(pointsvalue);



        mynumber.close();
    }
}
