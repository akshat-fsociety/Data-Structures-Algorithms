// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#

class Solution
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        // Will use 2 pointer approach
        Arrays.sort(arr); // sorted arrival time in ascending order
        Arrays.sort(dep); // sorted departure time in ascending order
        int i = 1; // points the arrival of the train at 1st index
        int j = 0; // points the departure time of the 0th index train cause we compare it
        
        int platform_needed = 1, min_platform = 1;
        
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                platform_needed++;
                i++;
            }else if(arr[i]>dep[j]){
                platform_needed--;
                j++;
            }
            if(platform_needed > min_platform){
                min_platform = platform_needed;
            }
        }
        return min_platform;
    }
    
}
