// https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1

class Solution {
    public String findSubString( String str) {
        int n = str.length();
 
        // if string is empty or having one char
        if (n <= 1)
            return str;
 
        // Count all distinct characters.
        int dist_count = 0;
 
        boolean[] visited = new boolean[256];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[str.charAt(i)] == false) {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }
 
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
 
        int count = 0;
        int[] curr_count = new int[256];
        for (int j = 0; j < n; j++) {
            
            curr_count[str.charAt(j)]++;
 

            if (curr_count[str.charAt(j)] == 1)
                count++;
 
            // if all the characters are matched
            if (count == dist_count) {
               
                while (curr_count[str.charAt(start)] > 1) {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }
 
                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        return str.substring(start_index,
                             start_index + min_len);
    }
}
