package com.arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7, 8};
        int[] arr2 = {2, 4, 6, 9, 10};
        int[] arr3 = mergeArrays(arr1, arr2);
       
        for(int a : arr3) {
        	System.out.print(a + " ");
        }
	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		int firstArrLength = arr1.length;
		int secondArrLength = arr2.length;
		int[] arr3 = new int[firstArrLength+secondArrLength];
		
		int i=0, j = 0, k = 0;
        while (i<firstArrLength && j <secondArrLength)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < firstArrLength)
            arr3[k++] = arr1[i++];
        while (j < secondArrLength)
            arr3[k++] = arr2[j++];
        return arr3;
	}
}
