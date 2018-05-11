
public class workspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searcher s = new Searcher();
		int[] A = {
				7,//0
				8,//1
				9,//2
				11,//3
				11,//4
				12,//5
				13,//6
				15,//7
				16,//8
				16,//9
				16,//10
				16,//11
				16,//12
				17,//13
				17,//14
				18,//15
				19,//16
				20,//17
				21,//18
				};
		System.out.println(s.doBinarySearch(A, 11)); // 3
		System.out.println(s.doBinarySearch(A, 7)); // 0
		System.out.println(s.doBinarySearch(A, 15)); // 7
		System.out.println(s.doBinarySearch(A, -56)); // -1
		System.out.println(s.doBinarySearch(A, 2)); // -1
		System.out.println(s.doBinarySearch(A, 21)); // 18
		System.out.println(s.doBinarySearch(A, 12)); // 5
		System.out.println(s.doBinarySearch(A, 16)); // 8
		System.out.println(s.doBinarySearch(A, 17)); // 13
		int[] B = {
				1, // 0 
				2, // 1
				3, // 2
				4, // 3
				5  // 4
				};
		int[] C = {
				1, // 0
				1, // 1
				2, // 2
				3, // 3
				4, // 4
				4, // 5
				};
		int[] D = {
				1, // 0
				1, // 1
				1, // 2
				2, // 3
				3, // 4
				3, // 5
				3  // 6
				};
		System.out.println(s.doBinarySearch(B, 1)); // 0
		System.out.println(s.doBinarySearch(B, 2)); // 1
		System.out.println(s.doBinarySearch(B, 3)); // 2
		System.out.println(s.doBinarySearch(B, 4)); // 3
		System.out.println(s.doBinarySearch(B, 5)); // 4
		
		System.out.println(s.doBinarySearch(C, 1)); // 0
		System.out.println(s.doBinarySearch(C, 2)); // 2
		System.out.println(s.doBinarySearch(C, 3)); // 3
		System.out.println(s.doBinarySearch(C, 4)); // 4
		System.out.println(s.doBinarySearch(C, 5)); // -1
		
		System.out.println(s.doBinarySearch(D, 1)); // 0
		System.out.println(s.doBinarySearch(D, 2)); // 3
		System.out.println(s.doBinarySearch(D, 3)); // 4
		System.out.println(s.doBinarySearch(D, 4)); // -1
		System.out.println(s.doBinarySearch(D, 5)); // -1
		
		
		}
}
