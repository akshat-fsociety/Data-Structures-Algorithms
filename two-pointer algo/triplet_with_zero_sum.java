/*Given an array of integers. Check whether it contains a triplet that sums up to zero. 

Example 1:

Input: N = 5, arr[] = {0, -1, 2, -3, 1}
Output: true
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
Example 2:

Input: N = 3, arr[] = {1, 2, 3}
Output: false
Explanation: No triplet with zero sum exists. 

Your Task:
You don't need to read input or print anything. Your task is to complete the boolean function findTriplets() which takes the array arr[] and the size of the array (n) as inputs and returns True if the given array has a triplet with zero sum and False otherwise. 

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)

Constrains:
1 <= N <= 104
-106 <= Ai <= 106*/


class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            if(twoSum(arr,-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }
    public boolean twoSum(int a[],int x,int i){
        // Arrays.sort(a);
        int j = a.length-1;
        while(i<j){
            if(a[i]+a[j]>x){
                j--;
            }else if(a[i]+a[j]<x){
                i++;
            }
            else return true;
        }
        return false;
    }
}
