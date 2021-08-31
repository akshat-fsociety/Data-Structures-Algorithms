// https://practice.geeksforgeeks.org/problems/next-permutation5226/1

class Solution{
    static List<Integer> nextPermutation(int n, int a[]){
        // code here
        ArrayList<Integer>al = new ArrayList<>();
        if(n<=0 || a==null)return al;
        
        int i= n-2;
        while(i>=0 && a[i]>=a[i+1])i--; 
        int j= n-1;
        if(i>=0){
            while(a[j]<=a[i]){
                j--;
            }
            swap(a, i, j);
        }
        reverse(a, i+1, n-1);
        for(int e:a){
            al.add(e);
        }
        return al;
    }
    
    public static void swap(int a[], int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void reverse(int a[], int i, int j){
        while(i<j)swap(a, i++, j--);
    }
