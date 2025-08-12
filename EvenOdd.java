
import java.util.Scanner;
public class EvenOdd {

    public static void main(String []args){

        int number , remainder;
        System.out.println("please enter integer number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        remainder =number % 2;

        if ( remainder == 0){
            System.out.println(number+ " Even");
        }
        else{
            System.out.println(number+" odd");
        }

    } 




    
}
