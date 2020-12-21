//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1/?category[]=prefix-sum&problemStatus=unsolved&page=1&query=category[]prefix-sumproblemStatusunsolvedpage1

class EquilibriumPoint {
    
    public static int equilibriumPoint(long a[], int n) {

        // Your code here
        long sum=0, sum2=0;
        for(int i=0; i<n; i++)sum+=a[i];
        for(int i=0; i<n; i++){
            sum-=a[i];
            
            if(sum==sum2){
                return(i+1);
            }
            sum2+=a[i];
        }
        return -1;
    }
}
