import java.util.Arrays;

public class worksapce {

	public static void main(String[] args) {
		Sorter s = new Sorter();
		int[] A = {
				56,//0
				13,//1
				-100,//2
				35,//3
				0,//4
				0,//5
				0,//6
				-100,//7
				1,//8
				16,//9
				12,//10
				13,//11
				24,//12
				25,//13
				-76,//14
				10009,//15
				9,//16
				0,//17
				1,//18
				};

		int[] B = {
				0,
				0,
				0,
				76,
				32,
				405,
				7,
				7,
				7,
				1,
				-10,
				-100,
				8
				};
		int[] C = Arrays.copyOfRange(B,  0, (B.length)/2);
		int[] D = Arrays.copyOfRange(B,  (B.length)/2, B.length );
//		s.doQuickSort(B);
//		for (int i : B) {
//			System.out.println(i);
//		}
//		s.doQuickSort(B);
//		for (int i : B) {
//			System.out.println(i);
//		}
		;
		//System.out.println("length : " + B.length);
		s.doMergeSort(B);
		for (int i : B) {
			System.out.println(i);
		}
		System.out.println("R: " +s.getReads());
		System.out.println("W: " +s.getWrites());
		
	}
}
