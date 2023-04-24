package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList();
		Stack stack = new Stack();
		int n= sc.nextInt();
		int m = sc.nextInt();
		int i=0;
		while(i<n) {
			
			queue.add(sc.nextInt());
			i++;
		}
		int j = m;
		while(j>0) {
			stack.push(queue.remove());
			j--;
		}
		int k =stack.size() ;
		while(k>0) {
			System.out.print(stack.get(k-1)+" ");
			k--;
		}
		int l = 1;
		int a = queue.size();
		while(l<=a) {
			System.out.print(queue.remove()+" ");
			l++;
		}
	}
}
