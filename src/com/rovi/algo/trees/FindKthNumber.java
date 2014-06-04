package com.rovi.algo.trees;

public class FindKthNumber {

	public static void main(String[] args) {

		// general test case
		int[] arr1 = { 1, 3, 8, 9, 10, 11, 13, 19, 21, 23 };
		int[] arr2 = { 2, 4, 6, 12, 15, 17, 18, 20, 22, 24 };

		runTest(arr1, arr2, 1);
		runTest(arr1, arr2, 2);
		runTest(arr1, arr2, 3);
		runTest(arr1, arr2, 4);
		runTest(arr1, arr2, 5);
		runTest(arr1, arr2, 6);
		runTest(arr1, arr2, 7);
		runTest(arr1, arr2, 8);
		runTest(arr1, arr2, 9);
		runTest(arr1, arr2, 10);
		runTest(arr1, arr2, 11);
		runTest(arr1, arr2, 12);
		runTest(arr1, arr2, 13);
		runTest(arr1, arr2, 14);
		runTest(arr1, arr2, 15);
		runTest(arr1, arr2, 16);
		runTest(arr1, arr2, 17);
		runTest(arr1, arr2, 18);
		runTest(arr1, arr2, 19);
		runTest(arr1, arr2, 20);
		runTest(arr1, arr2, 21);
		
		// arrays with repeated elements
		int[] arr3 = { 1, 3, 8, 9, 10, 11, 13, 19, 21, 23 };
		int[] arr4 = { 2, 3, 8, 12, 13, 17, 18, 20, 22, 24 };
		runTest(arr3, arr4, 1);
		runTest(arr3, arr4, 2);
		runTest(arr3, arr4, 3);
		runTest(arr3, arr4, 4);
		runTest(arr3, arr4, 5);
		runTest(arr3, arr4, 6);
		runTest(arr3, arr4, 7);
		runTest(arr3, arr4, 8);
		runTest(arr3, arr4, 9);
		runTest(arr3, arr4, 10);
		runTest(arr3, arr4, 11);
		runTest(arr3, arr4, 12);
		runTest(arr3, arr4, 13);
		runTest(arr3, arr4, 14);
		runTest(arr3, arr4, 15);
		runTest(arr3, arr4, 16);
		runTest(arr3, arr4, 17);
		runTest(arr3, arr4, 18);
		runTest(arr3, arr4, 19);
		runTest(arr3, arr4, 20);
		runTest(arr3, arr4, 21);
		
		// if array with length 0 is passed
		int[] arr5 = { 1, 3, 8, 9, 10, 11, 13, 19, 21, 23 };
		int[] arr6 = {};
		runTest(arr5, arr6, 5);
		runTest(arr5, arr6, 15);
		
		// if array contains 1 element only
		
		int[] arr7 = { 1, 3, 8, 9, 10, 11, 13, 19, 21, 23 };
		int[] arr8 = { 5 };
		
		runTest(arr7, arr8, 1);
		runTest(arr7, arr8, 2);
		runTest(arr7, arr8, 3);
		runTest(arr7, arr8, 4);
		runTest(arr7, arr8, 5);
		runTest(arr7, arr8, 6);
		runTest(arr7, arr8, 7);
		runTest(arr7, arr8, 8);
		runTest(arr7, arr8, 9);
		runTest(arr7, arr8, 10);
		runTest(arr7, arr8, 11);
		runTest(arr7, arr8, 12);
		
		// if array contains 2 element only
		
		int[] arr9 = { 1, 3, 8, 9, 10, 11, 13, 19, 21, 23 };
		int[] arr10 = { 15, 25};
		
		runTest(arr9, arr10, 1);
		runTest(arr9, arr10, 2);
		runTest(arr9, arr10, 3);
		runTest(arr9, arr10, 4);
		runTest(arr9, arr10, 5);
		runTest(arr9, arr10, 6);
		runTest(arr9, arr10, 7);
		runTest(arr9, arr10, 8);
		runTest(arr9, arr10, 9);
		runTest(arr9, arr10, 10);
		runTest(arr9, arr10, 11);
		runTest(arr9, arr10, 12);
	}


	private static int findKth(int[] arr1, int[] arr2, int arr1x,
			int arr1y, int arr2x, int arr2y, int k){
		
		
		if(arr1.length == 0){
			return arr2[k-1];
		}
		if(arr2.length == 0){
			return arr1[k-1];
		}
		int arr1mid = (arr1x + arr1y)/2;
		int arr2mid = (arr2x + arr2y)/2;
		if(k==1){
			if(arr1[arr1x] < arr2[arr2x]){
				return arr1[arr1x];
			}else{
				return arr2[arr2x];
			}
		}
		if(arr1x==arr1mid){
			boolean result = false;
			while(!result){
				if(k==1){
					result = true;
					if(arr1[arr1x]<arr2[arr2x]){
						return arr1[arr1x];
					}else{
						return arr2[arr2x];
					}
				}else{
					if(arr1x==arr1y){
						if(arr1[arr1x]<=arr2[arr2x]){
							k--;
							result = true;
							return arr2[arr2x+k-1];
						}else{
							if(arr2x==arr2y){
								return arr1[arr1x];
							}
							arr2x++;
							k--;
						}
					}else{
						if(arr1[arr1x]<=arr2[arr2x]){
							k--;
							arr1x++;
						}else{
							arr2x++;
							k--;
						}
					}
				}
				
			}
		}
		else
		if(arr2x==arr2mid){
			boolean result = false;
			while(!result){
				if(k==1){
					result = true;
					if(arr2[arr2x]<arr1[arr1x]){
						return arr2[arr2x];
					}else{
						return arr1[arr1x];
					}
				}else{
					if(arr2x==arr2y){
						if(arr2[arr2x]<=arr1[arr1x]){
							k--;
							result = true;
							return arr1[arr1x+k-1];
						}else{
							if(arr1x == arr1y){
								return arr2[arr2x];
							}
							arr1x++;
							k--;
						}
					}else{
						if(arr2[arr2x]<=arr1[arr1x]){
							k--;
							arr2x++;
						}else{
							arr1x++;
							k--;
						}
					}
				}
				
			}
		}
		else
		if((arr1mid-arr1x + 1) + (arr2mid - arr2x + 1) <= k){
			
			if(arr1[arr1mid] < arr2[arr2mid]){
				return findKth(arr1, arr2, arr1mid, arr1y, arr2x, arr2y, k-(arr1mid-arr1x));
			}else{
				return findKth(arr1, arr2, arr1x, arr1y, arr2mid, arr2y, k - (arr2mid-arr2x));
			}
		}else{
			if(arr1[arr1mid] < arr2[arr2mid]){
				return findKth(arr1, arr2, arr1x, arr1y, arr2x, arr2mid, k);
			}else{
				return findKth(arr1, arr2, arr1x, arr1mid, arr2x, arr2y, k);
			}
		}
		return 0;
	}

	private static void runTest(int[] arr1, int[] arr2, int k) {
		int arr1y = k - 1;
		int arr2y = k - 1;
		if((arr1.length + arr2.length) < k){
			System.out.println("k doesnt exist");
			return;
		}
/*		if(arr1.length == 0 || arr2.length == 0){
			System.out.println("array with length 0 is passed");
			return;
		}*/
		if (arr1.length < k) {
			arr1y = arr1.length - 1;
		}
		if (arr2.length < k) {
			arr2y = arr2.length - 1;
		}
		System.out.println(findKth(arr1, arr2, 0, arr1y, 0, arr2y, k));

	}

	
}
