import java.util.*; 
class solution 
{ 
  
static void frequencyOfEach(int []arr, int n) 
{ 
    int max = Integer.MIN_VALUE; 
    // finding maximum element in array 
    for (int i = 0;i<n;i++)  
{ 
    if (arr[i]>max) 
        max = arr[i]; 
} 
      
  
    // make hash array of size equal to maximum 
    // element in array 
    int []hash = new int[max + 1]; 
    Arrays.fill(hash,0); 
  
    /* Counting frequency of each element of array 
    and storing it in hash*/
    for (int i = 0; i < n; i++) { 
        hash[arr[i]]++; 
    } 
  
    // printing frequency of elements 
    for (int i = 0; i <= max; i++) { 
  
        /* If hash[i] has stored any value 
        i.e element has occurred atleat 
        once in array */
        if (hash[i] != 0) 
            System.out.println(i+"-->"+hash[i]); 
    } 
} 
  
public static void main(String args[]) 
{ 
    int []arr = { 5, 2, 2, 3, 5, 1, 1, 5, 3, 4 }; 
    int n = arr.length; 
    frequencyOfEach(arr, n); 
      
} 
} 
