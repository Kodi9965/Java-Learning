package test;
import java.util.*;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList();
		Scanner s = new Scanner(System.in);
		int len =s.nextInt();
		for(int i=0;i<len;i++) {
			arr.add(s.nextInt());
		}
		List<Integer> arr1 = new LinkedList();

		for(int j =0;j<len;j++) {
			int c = 1;
			for(int i=0;i<len;i++) {
				if(j==i) {
					continue;
				}
				else {
					c*=arr.get(i);
				}
			
			}
			arr1.add(c);
		}
		System.out.println(arr1);
		
	}

}
