// https://practice.geeksforgeeks.org/problems/sort-by-set-bit-count1153/1

class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        Arrays.sort(arr, (a,b) -> Integer.compare(Integer.bitCount(b), Integer.bitCount(a)));
    } 
}
