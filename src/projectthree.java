import java.util.Scanner;
import java.util.ArrayList;

/*
Brute-force bitmasking to 0/1 Knapsack
 */
public class projectthree {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);

        //Ask user for n items and weight of the container
        System.out.println("Input the total number of n items");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Input the max weight of the container");
        int maxWeightW = Integer.parseInt(input.nextLine());

        //Initialize an arrayList for the best subset and set tracker variable for the highest total weight of any subset
        ArrayList<Integer> bestSubset = new ArrayList<>();
        int maxValidWeight = 0;

        //ArrayList to track the weight of each object
        ArrayList<Integer> weightsOfItemsWi= new ArrayList<Integer>();
        System.out.println("Input the weight of each item");
        for(int i =0; i<n; i++){
            weightsOfItemsWi.add(Integer.parseInt(input.nextLine()));
        }

        //Bitmasking. iterates through all 2^n subsets
        for(int mask = 0; mask < (1<<n); mask++){
            ArrayList<Integer> currentSubset = new ArrayList<>();
            int currentWeight = 0;

            //Checks if i is included in each bit mask. Adds i to the current subset and adds weight to total
            for(int i = 0; i<n;i++){
                if((mask & (1 <<i ))!=0){
                    currentSubset.add(i);
                    currentWeight += weightsOfItemsWi.get(i);
                }
            }
            /*Checks current weight, max weight of container, and if the current weight its > than the valid weight
            if statement is true then the max vaild weight equals the currentWeight (best option, unless replaced by another subset)
            copies the current subset into the best subset
            */
            if (currentWeight <=maxWeightW && currentWeight > maxValidWeight){
                maxValidWeight = currentWeight;
                bestSubset = new ArrayList<>(currentSubset);

            }
        }
        //Print results
        System.out.println("Best subset: "+bestSubset);

        //Close for resources
        input.close();
    }
}
