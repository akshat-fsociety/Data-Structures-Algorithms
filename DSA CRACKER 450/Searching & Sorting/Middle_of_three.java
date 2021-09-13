// https://practice.geeksforgeeks.org/problems/middle-of-three2926/1

class Solution{
    int middle(int A, int B, int C){
        //code here
        if(B>=A && B<=C || B<=A && B>=C)return B;
        else if(A>=B && A<=C || A<=B && A>=C)return A;
        else return C;
    }
}
