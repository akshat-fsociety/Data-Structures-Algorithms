// https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Long>hm = new HashMap<Long, Long>();
        for(long e: a2){
            if(hm.containsKey(e)){
                hm.put(e, hm.get(e)+1);
            }else{
                hm.put(e,1l);
            }
        }
        for(long e: a1){
            if(hm.containsKey(e)){
                hm.put(e, hm.get(e)-1);
            }
        }
        int flag = 0;
        for(long x: hm.values()){
            if(x>=1){
                flag=1;
                break;
            }
        }
        if(flag==1)return "No";
        return "Yes";
    }
