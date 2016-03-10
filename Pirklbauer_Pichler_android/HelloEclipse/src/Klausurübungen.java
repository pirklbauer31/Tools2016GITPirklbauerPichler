
public class Klausurübungen {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;

		arr1 = new int[] { 1, 2, 3, 5, 6 };
		arr2 = new int[] { 7, 11, 17, 19, 50 };

		int[] arr3 = new int[arr1.length + arr2.length];
		int tmp1 = 0;
		int tmp2 = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			if (tmp2 == arr2.length || (tmp1 < arr1.length && arr1[tmp1] < arr2[tmp2])) {
				arr3[i] = arr1[tmp1];
				tmp1++;
			} else {
				arr3[i] = arr2[tmp2];
				tmp2++;
			}
		}
	}

}
