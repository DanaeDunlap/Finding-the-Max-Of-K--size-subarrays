/*
* Name: Danae Dunlap
* Date: 02/12/21
* Purpose: Given an array B of size 'N' and an integer k, find the       
* maximum for each and every contiguous subarray of size k.
*/

import java.util.*; 

class Main {
  public static void main(String[] args) {
		// intializes the values
		Scanner in = new Scanner(System.in); 
    int B[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}; 
		int n = B.length; 
		int temp = 0; 
		int subMax = 0; 
		System.out.print("Enter your k value: ");
		int k = in.nextInt(); 
		

		// finds the submaxes 
		
		for(int i = 0; i < n - k + 1; i++){
			int group = i; 
			subMax = 0; 
			
			for(int j = i; j < B.length && j <= group + k - 1 ; j++){

				temp = B[j]; 
				if(temp > subMax){
					subMax = temp; 	
				}// end of if statement

			}// end of nested for loop

			System.out.print(subMax + " "); 
		}// end of outer for loop
				
  }// end of public static void
}// end of Main class
