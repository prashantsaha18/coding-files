import java.util.Scanner;

public class gasStation {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input the Size of array : ");
       int n = sc.nextInt();
       System.out.println("input the gas of the items");
       int [] gas = new int[n];
       int [] cost = new int[n];
       for(int i = 0; i < gas.length; i++) {
        gas[i] = sc.nextInt();
       }
       System.out.println("For Cost");
       for(int i = 0; i < gas.length; i++) {
        cost[i] = sc.nextInt();
       }
       int start = gasStation(gas, cost);
       System.out.println("Start Index of the gas station is : " +start);
    }
    public static int gasStation(int [] gas , int [] cost) {
        int totalCost = 0;
        int totalGas = 0;
        for(int i = 0; i < gas.length; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalCost > totalGas) return -1;

        int currentCost = 0;
        int startIndex = 0;

        for(int i = 0; i < gas.length ; i++) {
            currentCost += cost[i] - gas[i];
            if(currentCost < 0) {
                startIndex = i + 1;
                currentCost = 0;
            }
        }
        return startIndex;
    }
}
