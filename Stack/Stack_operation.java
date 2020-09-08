/*Given a stack of integers and Q queries. The task is to perform operation on stack according to the query.

Note: use push() to add element in the stack, peek() to get topmost element without removal, pop() gives topmost element with removal, search() to return position if found else -1.

Input Format:
First line of input contains nubmer of testcases T. For each testcase, first line of input contains Q, number of queries. Next line contains Q queries seperated by space. Queries are as:

i x : (adds element x in the stack).

r : (returns and removes the topmost element from the stack).

h : Prints the topmost element.

f y : (check if the element y is present or not in the stack). Print "Yes" if present, else "No".

Output Format:
For each testcase, perform Q queries and print the output wherever required.

Your Task:
Your task is to complete functions insert(), remove(), headOf_Stack() and find(), to insert, remove returning top element and findiing the elment in stack respectively.

Constraints:
1 <= T <= 100
1 <= Q <= 103

Example:
Input:
2
6
i 2 i 4 i 3 i 5 h f 8
4
i 3 i 4 r f 3

Output:
5
No
Yes

Explanation:
Testcase 1: Inserting 2, 4, 3, and 5 onto the stack. Returning top element which is 5. Finding 8 will give No, as 8 is not in the stack.*/

class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
        
    }
    
    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();
        
        
    }
    
    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();
        System.out.println(x + " ");
    }
    
    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {
    
        if(st.contains(val)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
