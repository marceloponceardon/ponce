

public class Searcher {

	public int doBinarySearch(int[] arrayToSort, int i) {		
		return doBinarySearch(arrayToSort, i, arrayToSort.length - 1, 0);
	}
	
	private int doBinarySearch(int[] arrayToSort, int i, int high, int low) {
		int index = -1;
		if (low < high) {
			int mid = (low + high) / 2;
			if (arrayToSort[mid] >= i) {
				return doBinarySearch(arrayToSort, i, mid, low);
			}
			else /*(arrayToSort[mid] <= i)*/ {
				return doBinarySearch(arrayToSort, i, high, mid + 1);
			}
		}
		if (arrayToSort[low] == i) {
			return low;
		}
		if (arrayToSort[high] == i) {
			return high;
		}
		return index;
	}
}
