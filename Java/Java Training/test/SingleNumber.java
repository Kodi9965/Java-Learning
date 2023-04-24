package test;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Map map = new LinkedHashMap();
		int a = s.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=s.nextInt();
		}
//		System.out.println(arr);
		int n=1;
		for(int i=0;i<a;i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i],n);
			else
				map.put(arr[i],n+1);
		}
		
//		System.out.println(map);
		
		Set s1=map.entrySet();
		Iterator itr =  s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			
			if(m1.getValue().equals(n)) {
				
				System.out.println(m1.getKey());
			}
		}

	}

}
