package BigONotation;

import java.util.Arrays;
import java.util.Random;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class learnBinarySearch {

	public static void main(String[] args) {
		
		//binary search = Search algorithm that finds the position
		//of a target value within a sorted array.
		//Half of the array is eliminated during each *Step*
		
		int array[] = new int[100000000];
		Random rand = new Random();
		
		int target = rand.nextInt(100000000);
		
		System.out.println(target);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		//int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);
		
		
		if(index == -1) {
			System.out.println(target + " Not found");
		}else {
			System.out.println("Element found " + index);
		}

	}

	private static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle " + value);
			
			if(value < target ) {
				low = middle + 1;
			}else if(value > target) {
				high = middle - 1; 
			}else  {
				return middle;
			}
		}
		return -1;
	}

}
