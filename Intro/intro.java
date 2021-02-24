package Intro;

import java.util.*;

public class intro {
	

 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<n; i++){
                 if(i < k){
             pq.add(arr[i]);}
           else{
               if(pq.peek() < arr[i]){
                   pq.poll();
                   pq.add(arr[i]);}
               
              }
          }
      ArrayList<Integer> ans = new ArrayList<>(pq);
      Collections.sort(ans, Collections.reverseOrder());
      for(int a : ans)
          System.out.println(a+ " ");} 
        
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
	
		
	 
 }
 
 
 

		 
		
			

	


