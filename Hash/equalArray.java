public static boolean check(long a[],long b[],int n)
{
    HashMap<Long, Integer> hma = new HashMap<>();
    HashMap<Long, Integer> hmb = new HashMap<>();
    for(int i=0; i<n; i++){
        if(hma.containsKey(a[i])){
            hma.put(a[i], hma.get(a[i])+1);
        }else{
            hma.put(a[i], 1);
        }
    }
    for(int i=0; i<n; i++){
        if(hmb.containsKey(b[i])){
            hmb.put(b[i], hmb.get(b[i])+1);
        }else{
            hmb.put(b[i], 1);
        }
    }
    if( hma.keySet().equals(hmb.keySet()))                  // COMPARING THE KEYSET OF TWO HASHMAPS
    return true;
    else return false;
}
