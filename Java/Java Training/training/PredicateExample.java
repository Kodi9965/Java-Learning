package training;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s  = new Scanner( System.in);
//		String name = s.next();
////		Predicate<Integer> p = t->(age > 18);
////		System.out.println(p.test(age));
//		int n=5;
//		Predicate<String> p=temp->(temp.length()==n);
//		System.out.println(p.test(name));
		
		int[] a = {2,3,4,5,10,15,25,20,80,90};
		Predicate<Integer> p=temp->(temp>=10);
		Predicate<Integer> p1=temp->(temp%2==0);
		System.out.println("Greater than 10");
		m1(p,a);
		System.out.println();

		System.out.println("Even");
		m1(p1,a);
		System.out.println();

		System.out.println("Odd");
		m1(p1.negate(),a);
		System.out.println();

		System.out.println("Both Greater than 10 and Even");
		m1(p.and(p1),a);
		System.out.println();
		
		System.out.println("Both Greater than 10 or odd");
		m1(p.or(p1.negate()),a);
		System.out.println();
		
		System.out.println("Both Greater than 10 or Even");
		m1(p.or(p1),a);
		System.out.println();
		
		
	}
	public static void m1(Predicate<Integer> p,int[]a) {
		for (int i : a) {
			if(p.test(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
}
