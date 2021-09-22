// https://practice.geeksforgeeks.org/problems/arithmetic-number2815/1

class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        if(C==0){
            if(B==A)return 1;
            return 0;
        }
        int temp=(B-A)/C + 1;
        double d = (double)(B-A)/C+1;
        int check = (int) d;
        if(temp>0 && (check==d))
        {
            return 1;
        }
        return 0;

    }
}
