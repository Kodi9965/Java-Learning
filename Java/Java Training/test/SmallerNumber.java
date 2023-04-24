package test;
import java.util.*;
public class SmallerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();

		int n =s.nextInt();
		for(int i = 0;i<n;i++) {
			arr.add(s.nextInt());
		}
		for (int i=0;i<n;i++) {
			int count=0;

			for(int j=i+1;j<n;j++) {
				if(arr.get(i)>arr.get(j)) {
					count++;
				}
				
			}
			arr1.add(count);
		}
		System.out.println(arr1);
	}

}
