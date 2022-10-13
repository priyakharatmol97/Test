package stackinjava;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) 
	{
		Stack<Integer> st=new Stack<Integer>();//(LIFO)
		st.add(12);
		st.add(34);
		st.add(78);
		st.add(90);
		st.push(56);
		
		
		System.out.println(st.pop());
		
		System.out.println(st.peek());
		

	}

}
