package jt.pirai;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num=s.nextInt();
		for(int i=0;i<num;i++) {
			int n = s.nextInt();
			int[] arr1 = new int[n];
			for (int j = 0; j < arr1.length; j++) 
			{	
				arr1[j]= s.nextInt();
			}
				int temp;
				int count=0;
			for(int j =0;j<n;j++) 
			{
				for(int k=0;k<n-1;k++) {
					temp = arr1[k];
					arr1[k]=arr1[k+1];
					arr1[k+1]=temp;
					
				}
					count++;
				if(arr1[0]<arr1[n-1])
					{
					
					break;
				}
				
				
				
					
			}
			System.out.println(count);
			
		}		 
	}

}
