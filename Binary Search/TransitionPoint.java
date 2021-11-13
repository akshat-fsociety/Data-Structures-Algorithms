// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1

int transitionPoint(int a[], int n) {
    // code here
    int low=0,high=n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(a[mid]==0)low = mid+1;
        else if(a[mid]==1 && a[mid-1]==0)return mid;
        else if(a[mid]==1 && a[mid-1]==1)high = mid-1;
    }
    return -1;
}
