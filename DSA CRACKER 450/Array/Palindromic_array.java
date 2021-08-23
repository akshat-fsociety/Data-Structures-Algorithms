class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0; i<n; i++){
                      boolean j = isPalin(a[i]);
                      if(j==false){
                          return 0;
                      }
                  }
                  return 1;
           }
           public static boolean isPalin(int x){
               int rev = 0;
               int t = x;
               while(x!=0){
                  int d = x%10;
                  rev = (rev*10)+d;
                  x/=10;
               }
               if(rev==t)return true;
               else return false;
           }
