// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1

class Solution {
    public List<List<String>> Anagrams(String[] s) {
        
        // Your Code here
        Map<String, List<String>> map = new HashMap<>();
        String org="";
        for(String e : s){
            org = e;
            char c[] = e.toCharArray();
            Arrays.sort(c);
            String sorted = Arrays.toString(c);
            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(org);
        }
        return new LinkedList<>(map.values());
        
    }
}
