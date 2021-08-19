// https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class Solution{
    static int minJumps(int[] a){
        // your code here
        int n = a.length;
        if(n==0)return 0;
        if(a[0]==0)return -1;
        int maxrange = a[0], steps=a[0], jumps=1;
        for(int i=1; i<n; i++){
            if(i == n-1)return jumps;
            maxrange = Math.max(maxrange, i+a[i]);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=maxrange){
                    return -1;
                }
                steps = maxrange-i;
            }
        }
        return jumps;
    }
