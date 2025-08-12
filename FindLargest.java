import java.util.Scanner;

public class FindLargest {

    public static void main(String []args){

        int n1 ,n2 ,n3, largest;

        Scanner input = new Scanner(System.in);

        System.out.println("ENter num1");
        n1 = input.nextInt();

        System.out.println("ENter num2");
        n2 = input.nextInt();

        System.out.println("ENter num3");
        n3 = input.nextInt();

        input.close();

        if(n1 > n2 && n1 > n3){
            largest = n1;
        }
        else if (n2 > n1 && n2 > n3){
            largest = n2;
        }
        else {
            largest = n3;
        }

        System.out.printf("Largest among %d,%d and %d is %d", n1, n2, n3,largest);



    }
    
}
