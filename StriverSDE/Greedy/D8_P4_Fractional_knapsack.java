// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class comp implements Comparator<Item>{
    public int compare(Item a, Item b){
        double r1 = (double)(a.value)/(double)(a.weight);
        double r2 = (double)(b.value)/(double)(b.weight);
        if(r1<r2)return 1;
        else if(r2<r1)return -1;
        else return 0;
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, new comp());
        int curWeight = 0; double finalVal = 0.0;
        for(int i=0; i<n; i++){
            if(arr[i].weight+curWeight<=W){
                curWeight += arr[i].weight;
                finalVal += arr[i].value;
            }else{
                int remain = W-curWeight;
                finalVal += ((double)(arr[i].value)/(double)(arr[i].weight))*(double) remain;
                break;
            }
        }
        return finalVal;
    }
}
