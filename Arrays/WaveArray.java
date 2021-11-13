// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1

public static void convertToWave(int a[], int n){
        if(n%2==0){
            for(int i=0; i<n-1; i+=2){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }else{
            for(int i=0; i<n-2; i+=2){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }
    }
