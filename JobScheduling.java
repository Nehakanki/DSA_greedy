/**
 * JobScheduling
 */

/**
 * InnerJobScheduling
 */
import java.util.*;

public class JobScheduling {

    public static class Job {
            int id;
            int deadline;
            int profit;

    public Job(int id,int deadline, int profit){
      this.id = id;
      this.deadline = deadline;
       this.profit=  profit ;

    }
    
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));

    
        }

        // sort the object on basis of profit in descending Order
        Collections.sort(jobs, (obj1, obj2)->(obj2.profit - obj1.profit));

        // 0 1 40
        // 1 1 30
        // 2 4 20
        // 3 1 10 ---> is our jobs list
        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0 ;i<jobs.size() ;i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
            

        }
        System.out.println("Maximium Jobs to be selected"+ seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
        }


    }
}

