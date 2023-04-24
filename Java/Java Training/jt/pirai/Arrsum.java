package jt.pirai;

import java.util.Scanner;

public class Arrsum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		int num=s.nextInt();
		for(int i=0;i<num;i++) {
			int n = s.nextInt();
			int[] arr1 = new int[n];
				for (int j = 0; j < arr1.length; j++) {
					arr1[j]= s.nextInt();
				}
				int t = s.nextInt();
				for(int j=0;j<n;j++) {
					for(int k=j+1;k<n;k++){
						if(arr1[j]+arr1[k]==t) {
							count++;
						}
					}
				}
				System.out.println(count);
				
		}
	}

}
