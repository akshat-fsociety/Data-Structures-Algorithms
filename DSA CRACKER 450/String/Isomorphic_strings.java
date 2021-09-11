// https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1#

class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        int n = s1.length();
        int m = s2.length();
        if(n!=m)return false;
        int a1[] = new int[256];
        int a2[] = new int[256];
        for(int i=0; i<n; i++){
            a1[s1.charAt(i)]++;
            a2[s2.charAt(i)]++;
            if(a1[s1.charAt(i)]!=a2[s2.charAt(i)]){
                return false;
            }
        }
        return true;
    }
}
