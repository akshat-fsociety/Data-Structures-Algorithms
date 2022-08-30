// https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1

class Solution
{
    public static long getMaxArea(long a[], long n) 
    {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        long maxarea = a[0];
        long right_small[] = new long[a.length];
        long left_small[] = new long[a.length];
        for(int i=0; i<(int)n; i++){
            left_small[i] = -1;
            right_small[i] = n;
        }
        int i=0;
        while(i<n){
            while(!s.isEmpty() && s.peek()!=-1 && a[i]<a[s.peek()]){
                right_small[s.peek()] = (int)i;
                s.pop();
            }
            if(i>0&&a[i]==a[(i-1)]){
                left_small[i] = left_small[(int)(i-1)];
            }else{
                left_small[i] = s.peek();
            }
            s.push(i);
            i++;
        }
        for(int j=0; j<(int)n; j++){
            maxarea = Math.max(maxarea, a[j]*(right_small[j]-left_small[j]-1));
        }
        return maxarea;
    }
}
