//  Aria of circle by radius

import java.util.Scanner;
public class AreaOfCircle {

    public static void main( String []args){

        double radius , area;
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;

        System.out.println("area of the circle is: "+ area);




    }
    
}
