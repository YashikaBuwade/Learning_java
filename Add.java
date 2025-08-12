import java.util.Scanner;

public class Add {

    public static void main(String []args){

        int num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number 1"); // asking user
        num1 = input.nextInt();//will  an int value and store that
        System.out.println("enter the number 2"); // asking user
        num2 = input.nextInt();
        input.close();

        result = num1 + num2;

        System.out.printf("%d + %d = %d", num1,num2,result);



    }
    
}
