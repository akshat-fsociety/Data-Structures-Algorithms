// https://www.geeksforgeeks.org/split-the-binary-string-into-substrings-with-equal-number-of-0s-and-1s/

static int maxSubStr(String str, int n)
{

    int count0 = 0, count1 = 0;
    int cnt = 0;
    for (int i = 0; i < n; i++)
    {
        if (str.charAt(i) == '0')
        {
            count0++;
        }
        else
        {
            count1++;
        }
        if (count0 == count1)
        {
            cnt++;
        }
    }

    if (cnt == 0)
    {
        return -1;
    }
    return cnt;
}
 
