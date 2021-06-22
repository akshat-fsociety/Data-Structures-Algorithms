//https://www.codechef.com/JUNE21C/problems/CHFHEIST

import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
import java.lang.*; 
 
class FastReaderTemplate2 { 
	static long mod = 1000000007; 
 
	public static void main(String[] args) throws Exception { 
		InputReader in = new InputReader(System.in); 
		PrintWriter pw = new PrintWriter(System.out); 
 
		int t=in.readInt(); 
		while(t-->0){
		    long D = in.readLong();
		    long d = in.readLong();
		    long p = in.readLong();
		    long q = in.readLong();
		    long ans=0,daymod;
		    daymod = D/d;
		    ans = (p*daymod + q*((daymod-1)*(daymod)/2))*d;
		    if(D%d==0)pw.println(ans);
		    else{
		        ans+=D%d*(p + daymod*q);
                pw.println(ans);
		    }
		} 
 
		pw.close(); 
	} 
 
	public static long gcd(long x, long y) { 
		if (x % y == 0) 
			return y; 
		else 
			return gcd(y, x % y); 
	} 
 
	public static long pow(long n, long p, long m) { 
		long result = 1; 
		if (p == 0) 
			return 1; 
		if (p == 1) 
			return n; 
		while (p != 0) { 
			if (p % 2 == 1) 
				result *= n; 
			if (result >= m) 
				result %= m; 
			p >>= 1; 
			n *= n; 
			if (n >= m) 
				n %= m; 
		} 
		return result; 
	} 
 
	static class Pair implements Comparable<Pair> { 
		int a, b; 
 
		Pair(int a, int b) { 
			this.a = a; 
			this.b = b; 
		} 
 
		public int compareTo(Pair o) { 
			// TODO Auto-generated method stub 
			if (this.a != o.a) 
				return Integer.compare(this.a, o.a); 
			else 
				return Integer.compare(this.b, o.b); 
			// return 0; 
		} 
 
		public boolean equals(Object o) { 
			if (o instanceof Pair) { 
				Pair p = (Pair) o; 
				return p.a == a && p.b == b; 
			} 
			return false; 
		} 
 
		public int hashCode() { 
			return new Integer(a).hashCode() * 31 + new Integer(b).hashCode(); 
		} 
	} 
 
	static class InputReader { 
		private InputStream stream; 
		private byte[] buf = new byte[1024]; 
		private int curChar; 
		private int numChars; 
		private SpaceCharFilter filter; 
 
		public InputReader(InputStream stream) { 
			this.stream = stream; 
		} 
 
		public int read() { 
			if (numChars == -1) 
				throw new InputMismatchException(); 
			if (curChar >= numChars) { 
				curChar = 0; 
				try { 
					numChars = stream.read(buf); 
				} catch (IOException e) { 
					throw new InputMismatchException(); 
				} 
				if (numChars <= 0) 
					return -1; 
			} 
			return buf[curChar++]; 
		} 
 
		public int readInt() { 
			int c = read(); 
			while (isSpaceChar(c)) 
				c = read(); 
			int sgn = 1; 
			if (c == '-') { 
				sgn = -1; 
				c = read(); 
			} 
			int res = 0; 
			do { 
				if (c < '0' || c > '9') 
					throw new InputMismatchException(); 
				res *= 10; 
				res += c - '0'; 
				c = read(); 
			} while (!isSpaceChar(c)); 
			return res * sgn; 
		} 
 
		public String readString() { 
			int c = read(); 
			while (isSpaceChar(c)) 
				c = read(); 
			StringBuilder res = new StringBuilder(); 
			do { 
				res.appendCodePoint(c); 
				c = read(); 
			} while (!isSpaceChar(c)); 
			return res.toString(); 
		} 
 
		public double readDouble() { 
			int c = read(); 
			while (isSpaceChar(c)) 
				c = read(); 
			int sgn = 1; 
			if (c == '-') { 
				sgn = -1; 
				c = read(); 
			} 
			double res = 0; 
			while (!isSpaceChar(c) && c != '.') { 
				if (c == 'e' || c == 'E') 
					return res * Math.pow(10, readInt()); 
				if (c < '0' || c > '9') 
					throw new InputMismatchException(); 
				res *= 10; 
				res += c - '0'; 
				c = read(); 
			} 
			if (c == '.') { 
				c = read(); 
				double m = 1; 
				while (!isSpaceChar(c)) { 
					if (c == 'e' || c == 'E') 
						return res * Math.pow(10, readInt()); 
					if (c < '0' || c > '9') 
						throw new InputMismatchException(); 
					m /= 10; 
					res += (c - '0') * m; 
					c = read(); 
				} 
			} 
			return res * sgn; 
		} 
 
		public long readLong() { 
			int c = read(); 
			while (isSpaceChar(c)) 
				c = read(); 
			int sgn = 1; 
			if (c == '-') { 
				sgn = -1; 
				c = read(); 
			} 
			long res = 0; 
			do { 
				if (c < '0' || c > '9') 
					throw new InputMismatchException(); 
				res *= 10; 
				res += c - '0'; 
				c = read(); 
			} while (!isSpaceChar(c)); 
			return res * sgn; 
		} 
 
		public boolean isSpaceChar(int c) { 
			if (filter != null) 
				return filter.isSpaceChar(c); 
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; 
		} 
 
		public String next() { 
			return readString(); 
		} 
 
		public interface SpaceCharFilter { 
			public boolean isSpaceChar(int ch); 
		} 
	} 
 
}
