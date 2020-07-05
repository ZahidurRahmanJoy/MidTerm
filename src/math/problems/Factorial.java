package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        //to scan the given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: "+factorial);}

    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = fact(n-1)* n;
        return output;
    }
}

