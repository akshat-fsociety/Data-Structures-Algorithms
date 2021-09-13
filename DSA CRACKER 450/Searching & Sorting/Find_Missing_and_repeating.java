// https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        int xor1;

		/* Will have only single set bit of xor1 */
		int set_bit_no;

		int i;
		int y=0, x = 0;

		xor1 = arr[0];

		/* Get the xor of all array elements */
		for (i = 1; i < n; i++)
			xor1 = xor1 ^ arr[i];

		for (i = 1; i <= n; i++)
			xor1 = xor1 ^ i;
			
		set_bit_no = xor1 & ~(xor1 - 1);
		
		for (i = 0; i < n; i++) {
			if ((arr[i] & set_bit_no) != 0)
				
				x = x ^ arr[i];

			else
				
				y = y ^ arr[i];
		}
		for (i = 1; i <= n; i++) {
			if ((i & set_bit_no) != 0)
				
				x = x ^ i;

			else
				
				y = y ^ i;
		}
		int res[] = new int[2];
		for(int e: arr){
		    if(x==e){
		        res[0] = x;
		        res[1] = y;
		        break;
		    }else{
		        res[0] = y;
		        res[1] = x;
		    }
		}
		return res;
    }
}
