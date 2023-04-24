package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Set set = new HashSet();
		int n = s.nextInt();		
		for(int i=0;i<n;i++) {
			set.add(s.nextInt());
		}
		int i=1;
		int s1 = set.size();
		while(i<=s1) {
			if(s1>1) {
				if(!set.contains(i)) {
					set.add(i);
					System.out.println(i-1+ " "+i);
				}
			}
			else {
				System.out.println(i+" "+(i+1));
			}
			i++;
		}
	}
}
