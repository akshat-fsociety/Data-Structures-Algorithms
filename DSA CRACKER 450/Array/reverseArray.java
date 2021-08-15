// https://practice.geeksforgeeks.org/problems/reverse-a-string/1

class Reverse
{
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String revstr = "";
        for(int i=str.length()-1; i>=0; i--){
            revstr += str.charAt(i);
        }
        return (revstr);
    }
