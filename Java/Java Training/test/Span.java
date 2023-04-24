package test;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
 

class Span {

    public static void main(String[] args)

    {
    	Scanner s = new Scanner(System.in);
    			int n = s.nextInt();
        		int[] arr = new int[n];
        		for (int j = 0; j < arr.length; j++) 
       			{	
       				arr[j]= s.nextInt();
       			}
        		Stack stack = new Stack();
        		for(int i=0;i<n;i++) {
            		int count =1;

        			for(int j = i - 1;(j >= 0) && (arr[i] >= arr[j]); j--) {
        				count++;
        			}
        			stack.push(count);
//        	        int n1 = arr.length;
//        	        int S[] = new int[n1];
//        	        count(arr, n1, S);
//        	       // printArray(S);
//        	        System.out.print(Arrays.toString(S));
        		}
        		System.out.println(stack);



    
    }
}