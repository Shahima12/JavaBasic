
public class GroupProjectTask8 {

	public static void main(String[] args) {

		/*
		 * Maximum and minimum number in the array?
		 * 
		 */
		
		int[] arr= {10, 20, 90, 50,70};
		
		//assuming first number is the largest number
		int largest=arr[0];
		
		//assuming first number is the smallest number
		int smallest=arr[0];
		
		//iterating through all the elements
		for (int elements:arr) {
			
			//checking if we have something even smaller if yes update the smallest
			if(largest<elements) {
				largest=elements;
			}
			
			if(elements<largest) {
				smallest=elements;
			}
		}
		System.out.println("Largest number is "+largest);
		System.out.println("Largest number is "+smallest);

	}

}
