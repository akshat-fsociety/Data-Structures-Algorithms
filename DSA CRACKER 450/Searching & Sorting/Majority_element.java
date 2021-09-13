// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // MOORE'S VOTING ALGORITHM
        int elem=-1, count=0;
        for(int e: a){
            if(count==0){
                elem = e;
            }
            if(elem == e){
                count++;
            }else {
                count--;
            }
        }
      
      // counting elem in array
        int c=0;
        for(int x: a){
            if(elem==x)c++;
        }
        if(c>size/2)return elem;
        else return -1;
    }
}
