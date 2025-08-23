
import java.util.Scanner;

public class projectone {
    //ignore this
    public static void main(String[] args) {

        //Initialize the input object
        Scanner input = new Scanner(System.in);
        //Prompt the user for integers a,b, and n
        System.out.println("Input integers a, b, and n. Ensure a<=b and n=>1 ");

        int a = Integer.parseInt(input.nextLine());

        int b = Integer.parseInt(input.nextLine());

        int n = Integer.parseInt(input.nextLine());
        //Fail program if the user doesn't input correct values
        if (a>b || n<1){
            System.out.println("Invalid Input");
            return;
        }

        //Sum of integers formula. The most straight forward method
        int summnationOfIntegers = ((b - a + 1) * (a + b)) / 2;

        //Begin count at 0 to accurately count sum of n integers
        int count = 0;
        int sumOfOddIntegers = 0;

        //For loop to find the first odd n integers in range a to b
        for (int i = a; i <= b && count < n; i++) {
            if (i % 2 != 0) {
                sumOfOddIntegers += i;
                count++;
            }
        }

        //Print the results from the calculations
        System.out.println("Sum of integers in range a to b: " + summnationOfIntegers);
        System.out.println("Sum of n odd integers: "+ sumOfOddIntegers);

        //Close the scanner to save resources
        input.close();

    }
}
