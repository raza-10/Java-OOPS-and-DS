package Intro;

import java.util.*;

public class intro {
	

 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
//		int n = sc.nextInt();
//		
//		int k = sc.nextInt();
//		
//		int arr[] = new int[n];
//		
//		for(int i = 0; i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i =0; i<n; i++){
//                 if(i < k){
//             pq.add(arr[i]);}
//           else{
//               if(pq.peek() < arr[i]){
//                   pq.poll();
//                   pq.add(arr[i]);}
//               
//              }
//          }
//      ArrayList<Integer> ans = new ArrayList<>(pq);
//      Collections.sort(ans, Collections.reverseOrder());
//      for(int a : ans)
//          System.out.println(a+ " ");} 
//        
//          int a[] = new int[k];
//          for(int i = k-1; i>=0; i--){
//          a[i] = pq.poll();
//          System.out.println(a[i]);}
          
		
	
		
//		System.out.print("Enter The first number :");
//		
//		 int a =sc.nextInt();
//		 
//		 System.out.print("Enter the second number:");
//		 
//		 int b= sc.nextInt();
//		 int c = a/b;
//		 
//		 
//		 if (c%2 == 0) {
//			 System.out.println("Even");
//			
//		 }else 
//			 System.out.println("Odd");
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
	
		int a[]=  new int[n];
		if(n==0) {
			System.out.println(n);}
			else {	
		System.out.println("Enter non negative integer values for array: ");
		
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		
		}
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i = 0; i<n;i++) {
			if(a[i]%2 == 0) {
				dq.addFirst(a[i]);
			}else {
				dq.addLast(a[i]);
			}
		
	 
		
			System.out.println(dq);}}
		
 }
 

 

		 
		
			

	


