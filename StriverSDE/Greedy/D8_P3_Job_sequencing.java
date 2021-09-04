// https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b)->(a.profit-b.profit));
        
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i].deadline>max)
                max = arr[i].deadline;
        }
        
        int res[] = new int[max+1];
        Arrays.fill(res, -1);
        
        int count=0, profit=0;
        for(int i=0; i<n; i++){
            for(int j=arr[i].deadline; i>=0; i--){
                if(res[i]==-1){
                    res[j] = i;
                    count++;
                    profit += arr[i].profit;
                    break;
                }
            }
        }
        int result[] = new int[2];
        result[0] = count;
        result[1] = profit;
        return result;
    }
