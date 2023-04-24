package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestPalin {
	public static String reverse(String str) {
		ArrayList<Character> arr = new ArrayList<>();
		int len = str.length();
		char[] ch = str.toCharArray();
		String str1="";
		
		for(int i=len-1;i>=0;i--) {
			arr.add(ch[i]);
		}
		for (char c : arr) {
			str1+=c;
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str  = s.next();
		
		int len = str.length();
		ArrayList arr = new ArrayList();
		for(int i=0;i<len;i++) {
			arr.add(str.charAt(i));
		}
		ArrayList<String>arr1 = new ArrayList();
		int l=0;
		int n = arr.size();
		while(l<n)
		{
			for(int i=l;i<n;i++)
			{
				String str1="";
				for(int j=l;j<=i;j++)
				{
					str1=str1+arr.get(j);
				}
				arr1.add(str1);
				
			}
			
			l++;
		}
//		System.out.println(arr1);
		int c =1;
		List <String>l1 = new ArrayList();
//		System.out.println(arr1);
		for(String a:arr1) {
			if(a.length()>1) {
				if(a.equals(reverse(a))) {
//					System.out.println(a);
//					if(max<a.length()) {
//						max
//					}
					l1.add(a);
				}
			}
		}
//System.out.println(l1);
		int max=0;

		for(String b:l1) {
			if(max<b.length()) {
				max=b.length();
			}
			
		}
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).length()==max) {
				System.out.println(l1.get(i));
				break;
			}
		}
//		System.out.println();
	}

}
