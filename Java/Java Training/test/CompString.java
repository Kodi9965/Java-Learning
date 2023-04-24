package test;

import java.util.*;
import java.util.Map.Entry;


public class CompString {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
//		Map <Character,Integer> map = new LinkedHashMap<>();
//		Map <Character,Integer> map1 = new LinkedHashMap<>();
//
//		String s1 = s.next();
//		String s2 =s.next();
//		int size = s1.length();
//		int size1 = s2.length();
//		char[] ch = s1.toCharArray();
//		char[] ch1 = s2.toCharArray();
//		for(int i=0;i<size;i++) {
//			map.put(ch[i], i);
//		}
//		for(int i=0;i<size1;i++) {
//			map1.put(ch1[i], i);
//		}
////		System.out.println(map);
////		System.out.println(map1);
//
//		if(s1.length()==s2.length()) {
////			System.out.println(map1.size());
////			System.out.println(map.size());
//			for(int i=0;i<s1.length();i++) {
//				if(map.values().equals(map1.values())) {
//					System.out.println("false");
//				}
//				else {
//					System.out.println("true");
//					break;
//				}
//			}
//		
//		}
//		else {
//			System.out.println("False");
//		}
		
		Map <Character,Integer> m1 = new LinkedHashMap<>();
		Map <Character,Integer> m2 = new LinkedHashMap<>();

		String s1 = s.next();
		String s2 =s.next();
		int size = s1.length();
		int size1 = s2.length();
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		int n=1;
		if(size==size1) {
			for(int i=0;i<size;i++) {
				if(!m1.containsKey(ch[i]))
					m1.put(ch[i],n);
				else
					m1.put(ch[i],n+1);
			}
			System.out.println(m1);

			for(int i=0;i<size1;i++) {
				if(!m2.containsKey(ch1[i]))
					m2.put(ch1[i],n);
				else
					m2.put(ch1[i],n+1);
			}
			System.out.println(m2);
//		if(s1.length()==s2.length()) {
			Set a = new HashSet(m1.values());
			Set b = new HashSet(m2.values());
			if(a.equals(b)&& m1.size()==m2.size()) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
		
		else {
			System.out.println("false");
		}
	
		
	}

}
