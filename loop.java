import java.util.Scanner;
public class inputadd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter");
        int num1 = input.nextInt();

        System.out.print("enter");
        int num2 = input.nextInt();

        System.out.print("enter");
        int num3 = input.nextInt();

        int  add = num1+num2+num3;
        System.out.print(add);

        input.close();


    }
}