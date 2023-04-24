package test;

import java.util.*;

public class Maximum_Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		 Collections.sort(arr, Collections.reverseOrder());
		int max = arr.get(0);
//		System.out.println(arr);
		for(int i=0;i<n;i++) {
			int v = arr.get(i)*(i+1);
			if(max<=v) {
				max =v;
			}
			
			
		}
		System.out.println(max);

	}
}

