
import java.util.*;

public class activitySelection {

    public static void main(String[] args) {

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        int endtime_lastactivity = 0;
        int count = 0;
        int n = start.length;
        // 1. end time is sorted as per the question
        // 2. always select the first activity
        // 3. startTime >= last choosen activity's end time
        // 4. count++

        for (int i = 0; i < n; i++) {
            if (start[i] >= endtime_lastactivity) {
                count++;
                endtime_lastactivity = end[i];
                System.out.println("A" + " " + i);
            }

        }

        System.out.println("Total no. of disjoint activities" + count);
    }
}