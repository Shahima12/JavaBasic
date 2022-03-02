
public class GroupProjectTask9 {

	public static void main(String[] args) {
		
		/*
		 * Maximum and minimum number in the array?
		 * 
		 */
		
		int[] arr= {10, 20, 90, 50,70};
		
		//assuming first number is the largest number
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		
		//iterating through all the elements
		for (int elements:arr) {
			
			//checking if we have something even smaller if yes update the smallest
			if(largest<elements) {
				secondLargest=largest;
				largest=elements;
				
			}else if (elements >secondLargest && elements!=largest) {
				secondLargest=elements;
			}
			
		}
		System.out.println("Largest number is "+largest);
		System.out.println("Second Largest number is "+secondLargest);



	}

}
