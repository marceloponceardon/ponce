import java.util.Arrays;
import java.util.Random;

public class SorterAnalysis {

	private SorterUtilities utility;
	private Sorter sorter;

	public static void main(String[] args) {
		SorterAnalysis s = new SorterAnalysis();
		s.analyse();
	}
	
	private void analyse() {
		utility = new SorterUtilities();
        
        sorter = new Sorter();
        
        analyseRandom();
	}
	
	private void analyseRandom() {
			
		System.out.print(String.format("%6s", ""));
		for (int i = 0; i < 4; i++) {
			System.out.print(String.format("%12s","random"));			
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(String.format("%12s","nearly"));			
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(String.format("%12s","reverse"));			
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(String.format("%12s","few unique"));			
		}
		
		System.out.println();
		
		
		System.out.print(String.format("%6s", "n"));
		for (int i = 0; i < 4; i++) {
			System.out.print(String.format("%12s%12s%12s", "QS-reads", "QS-writes", "QS-calls"));
			System.out.print(String.format("%12s%12s%12s", "MS-reads", "MS-writes", "QS-calls"));
		}
		System.out.println();
				
		for (int n = 100; n <= 10000; n+=100){
			///////////////////////////////////RANDOM
			int[] random = utility.createRandomArray(n);
			int[] copy;
						
			System.out.print(String.format("%6d",n));
			
			copy = Arrays.copyOf(random, n);
			sorter.reset();			
			sorter.doQuickSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			copy = Arrays.copyOf(random, n);
			sorter.reset();			
			sorter.doMergeSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			///////////////////////////////////NEARLY SORTED
			int[] nearlySorted = utility.createNearlySortedArray(n);			
			
			copy = Arrays.copyOf(nearlySorted, n);
			sorter.reset();			
			sorter.doQuickSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			copy = Arrays.copyOf(nearlySorted, n);
			sorter.reset();			
			sorter.doMergeSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			///////////////////////////////////REVERSE ORDER
			int[] reversed = utility.createReverseOrderArray(n);			
			
			copy = Arrays.copyOf(reversed, n);
			sorter.reset();			
			sorter.doQuickSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			copy = Arrays.copyOf(reversed, n);
			sorter.reset();			
			sorter.doMergeSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			///////////////////////////////////NEARLY SORTED
			int[] fewUnique = utility.createFewUniqueArray(n);			
			
			copy = Arrays.copyOf(fewUnique, n);
			sorter.reset();			
			sorter.doQuickSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			copy = Arrays.copyOf(fewUnique, n);
			sorter.reset();			
			sorter.doMergeSort(copy);
			System.out.print(String.format("%12d%12d%12d", sorter.getReads(), sorter.getWrites(), sorter.getCalls()));

			System.out.println();

		}
		
	}
		
}
