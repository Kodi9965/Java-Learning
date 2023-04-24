package March_14;

import java.util.*;
import java.util.function.Predicate;

public class Top_K_Frequent_Elements {
//	public static int[] topKFrequent(int[] nums, int k) {
//        int n=nums.length;
//        HashMap<Integer,Integer> h=new HashMap();
//        for(int i=0;i<n;i++)
//            h.put(nums[i],(int)h.getOrDefault(nums[i],0)+1);
//        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> b.getValue ()-a.getValue());
//        
//        
//        for(Map.Entry entry:h.entrySet())
//            pq.add(entry);
//        
//        int ans[]=new int[k];
//        for(int i=0;i<k;i++)
//            ans[i]=pq.poll().getKey();
//        
//        return ans;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		List<Integer> arr1 = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(s.nextInt());
		}
		System.out.println(arr);
	
		Predicate<Integer> p1 = i->i==i;
//		
//		List<Integer>l1 = arr.stream().filter(i->{
//			
//		});
		
		
	}

}
