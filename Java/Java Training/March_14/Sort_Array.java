package March_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arr = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(s.nextInt());
		}
		List<Integer> l1 = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l2 = arr.stream().filter(i->i%2!=0).collect(Collectors.toList());
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i:l1) {
			arr2.add(i);
		}
		for(int i:l2) {
			arr2.add(i);
		}
		System.out.println(arr2);
	}

}
