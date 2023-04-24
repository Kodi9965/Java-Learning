	package jt.pirai;
	
	import java.util.Scanner;
	
	public class MainDemo {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			for(int i=0;i<num;i++) {
				int n = s.nextInt();
				int[] arr1 = new int[n];
					for (int j = 0; j < arr1.length; j++) {
						arr1[j]= s.nextInt();
					}
				
					int temp=0;
					int a =0;	
					while (a<arr1.length){
						int k =a;
						int j=0;
						if (arr1[a]==0) {
						while(j<arr1.length-a-1) {
							
								temp = arr1[k];
								arr1[k]=arr1[k+1];
								arr1[k+1]=temp;
							
							j++;
							k++;
						}
						}
					a++;
					}
					for(int t :arr1) {
						System.out.print(t+" ");
					}		
			}
		}
	}