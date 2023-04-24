package jt.pirai;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pushpop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Stack<Character> stack = new Stack<Character>();
		char[] ch = str.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
//			if(ch[0]==')'&&ch[ch.length-1]=='(') {
//				System.out.println("False");
//				break;
//			}
			stack.push(ch[i]);
			
		}
		
		

		
			
			
		if(stack.firstElement().equals('(') && stack.firstElement().equals('[')&& stack.firstElement().equals('{')&&stack.peek().equals(')') && stack.peek().equals(']')&& stack.peek().equals('}') ) {
			int c=0;
			Enumeration<Character> e=stack.elements();
			while(e.hasMoreElements())
			{
				
				
				Character  n = (Character)e.nextElement();
				
				if(n.equals('(')||n.equals('[')||n.equals('{')) {
					c+=1;
				}
				else {
					c-=1;
				
				}
					
			}
			if(c!=0){
				System.out.println("False");
			}
			else {
				System.out.println("True");
			}
			}	
			else {
				System.out.println("False");
				
			}
	}
		

		

		
}


