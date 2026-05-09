package BigONotation;

public class linerTimeBigO {

	public static void main(String[] args) {
		//linear time
		 //* Looping through element in a array
		 //* searching through linked List
		int[] arr = {9,2,6,7,5,3,2,8};
		int index = linearSearch(arr, 8);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}else {
			System.out.println("Element not found");
		}
	}

	private static int linearSearch(int[] arr, int value) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;

	}

}
