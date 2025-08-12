//  find largest no using ternary operator

public class Ternary {

    public static void main (String[]args){

        int n1 = 23 , n2 = 45 ,n3 =11;
        int largest;

        largest = (n1 > n2 && n1 > n3) ? n1 :((n2>n1 && n2>n3) ? n2 : n3);

        System.out.printf(" largest among %d ,%d and %d is %d",n1 ,n2, n3 , largest);
    }
    
}
