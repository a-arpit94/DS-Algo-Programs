package com.arpit.LeetCode;

public class NumberOfStepsToReduceNumberToZero {
	
	public static void main(String[] args) {
	
		/*Input: num = 14
				Output: 6
				Explanation: 
				Step 1) 14 is even; divide by 2 and obtain 7. 
				Step 2) 7 is odd; subtract 1 and obtain 6.
				Step 3) 6 is even; divide by 2 and obtain 3. 
				Step 4) 3 is odd; subtract 1 and obtain 2. 
				Step 5) 2 is even; divide by 2 and obtain 1. 
				Step 6) 1 is odd; subtract 1 and obtain 0.
				*/
		System.out.println(numberOfSteps(14));
	}
	
	public static int numberOfSteps (int num) {
        int count = 0;
        while(num > 0){
            count += (num % 2 == 0 || num ==1) ? 1:2;
            num/=2;
        }  
        return count;
    }

}


/* Alternative Simple Approach:
      while(num > 0){
           if(num%2==0)
        	   num/=2;
           else
        	   num--;
           count++;
        }
  */
