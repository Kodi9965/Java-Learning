package jt.pirai;
import java.util.Scanner;

//package jt.pirai;
//
//import java.util.Scanner;
//
//class StringBuffer{
//	StringBuffer(char[] charSeq,int st,int en){
//		try {
//			
//		} 
//		catch (IndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//	}
//}
//public class appendStringBuffer {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the String ");
//		String input = s.next();
//		System.out.println("Enter the start value :");
//		int st = s.nextInt();
//		System.out.println("Enter the end value :");
//		int en = s.nextInt();
//		char[] charSeq = input.toCharArray();
//		
//		StringBuffer buffer =new StringBuffer(charSeq,st,en);
//		
//	}
//
//}

import java.io.*;
public class strBuffer {

   public static void main(String args[]) {


	   	Scanner s = new Scanner(System.in);
	   	String str = s.next();
//	   	char[] ch = {'k','o','d','i'};
//	   	int  of = s.nextInt();
//	   	int len = s.nextInt();
	   	StringBuffer buffer = new StringBuffer(str);
//	   	buffer.append("Dhanushkodi");
	   	
	   try {
//		   buffer.append("asd");
//		   buffer.append(ch,of,len);
//		   System.out.println(buffer.charAt(2));
//		   buffer.delete(7,str.length());
		   buffer.insert(7,"alpha");
//		   System.out.println(buffer.l	astIndexOf(str));
	   }
	   catch(Exception e){
		   System.out.println(e);
	   }
	   	System.out.println(buffer);
   }
}


