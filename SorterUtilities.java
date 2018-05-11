import java.util.Random;

public class SorterUtilities {

	private Random generator;
	
	public SorterUtilities() {
        generator = new Random();
        generator.setSeed(12345);  //do not change this statement
	}
	
	public int[] createRandomArray(int size) {
		int[] array = new int[size];		
        
        for (int i = 0; i < size; i++) {
        	array[i] = generator.nextInt(size);
        }
		
		return array;		
	}
	
	public int[] createNearlySortedArray(int size) {
		int changes = size / 50;
		int temp = 0;
		int indexA = 0;
		int indexB = 0;
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = i;
		}
		
        for (int i = 0; i < changes; i++) {
        	indexA = generator.nextInt(size);
        	indexB = generator.nextInt(size);
        	
        	temp = array[indexA];
        	array[indexA] = array[indexB];
        	array[indexB] = temp;
        }
		
		return array;		
	}	

	public int[] createReverseOrderArray(int size) {
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = size - i - 1;
		}
				
		return array;		
	}	
	
	public int[] createFewUniqueArray(int size) {
		int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
        	array[i] = generator.nextInt(10);
        }
		
		return array;		
	}
	
	public boolean verifySort(int[] sortedArray) {

		for (int i = 0; i < sortedArray.length; i++) {
			if (i + 1 < sortedArray.length) {
				if (sortedArray[i] > sortedArray[i+1]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public long checkSum(int[] array) {
		long sum = 0;
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
		}
		return sum;		
	}	
}
