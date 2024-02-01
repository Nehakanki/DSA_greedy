import java.util.*;


public class fractionalKnapsack {

    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        int W= 50;

        // sort the ratio (V/W) into ascending order
        //reverse looping so that we can get the higher ratio 
        // if ---> capacity >= value[i]  ans++ and capacity --
        // else ----> ans= ratio*weight[i] break;

        double[][] ratio = new double[value.length][2];
        // 1st col -> index   2nd col -> ratio
        for(int i=0;i<value.length;i++){
            ratio[i][0]= i;
            ratio[i][1]= value[i]/(double)weight[i];

        }
        //using comparator for sorting 2D arrays
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        //based on ratio sorting asceding order
        int ans = 0;
        int capacity=W;

        for(int i = ratio.length-1;i>=0;i--){
            // capacity >= value 
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                ans += value[idx];
                capacity-=weight[idx];
            }
            else{
                ans+= (ratio[i][1]*capacity);
                break; 
                // since the knapsack is filled
            }
        }
        System.out.println("The maximum value we get "+ ans);

    }
}