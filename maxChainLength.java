import java.util.*;


/**
 * 
 * 
 * maxChainLength
 */
public class maxChainLength {

    public static void main(String[] args) {
        int[][] pairs = {{5,24}, {39,60},{5,28},{27,40},{50,90}};
       
        // sort array on basis of the 2nd ele in pair

        // lamba fun for sorting
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));


         // select the first pair
         int chainLength = 1;
         int lastElemnet = pairs[0][1];  //24
         for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastElemnet){
                    chainLength++;
                lastElemnet = pairs[i][1];
            }
         }
         System.out.println(chainLength);

    } 
}