/*
For this code block, I utilized recursive exponentiation
 */
import java.util.Scanner;

//In order to use recursion, I split the code into two methods, a main and one doing the recursion
public class projecttwo {
    //ignore this
    public static void main(String[] args){
        //Initialize the input with a constructor call
        Scanner input = new Scanner(System.in);

        //Asking for user input
        System.out.println("Input the base number");
        int base = Integer.parseInt(input.nextLine());
        System.out.println("Input the power");
        int power = Integer.parseInt(input.nextLine());

        //Call the power method and print results
        int result = power(base, power);
        System.out.println(base + "^" + power + " = " + result);

    }
    //I used a recursion method instead of a for loop because using a for loop would be iteration, not the latter
    //Breaks down the input and then multiplies(Stack unwinds)
    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
}