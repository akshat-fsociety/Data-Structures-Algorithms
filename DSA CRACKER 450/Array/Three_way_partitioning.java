// https://practice.geeksforgeeks.org/problems/three-way-partitioning/1#


/*****************************************************************************************************
  Concept used Dutch National Flag Algo because we need to sort the array according to three conditions 
  
  1) elem < a   -----> should come first (we can assume this as 0's)
  2) elem >= a && elem <= b   -----> should come second (we can assume this as 1's)
  3) elem > b  -----> should comr third (we can assume this as 2's)
  
 *****************************************************************************************************/



class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
        int low = 0, mid=0, high = arr.length-1;
        while(mid<=high){
            if(arr[mid]<a){
                int t = arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;
                low++; mid++;
            }
            else if(arr[mid]>=a && arr[mid]<=b){
                mid++;
            }else{
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
            }
        }
    }
}
