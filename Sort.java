package com.edu.test;

public class Sort {
	public void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public void directSort(int[] array) {
		int index;
		for(int i=1;i<array.length;i++) {
			index = 0;
			for(int j=1;j<array.length-i;j++) {
				if(array[j] > array[index]) {
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index] = temp;
		}
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public void reversalSort(int[] array) {
		for(int i=0;i<=array.length/2;i++) {
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		//int[] array = new int[]{3,5,9,4,1,2};
		int[] array = new int[]{1,2,3,4,5};
		Sort sort = new Sort();
		//sort.bubbleSort(array);
		sort.directSort(array);
		//sort.reversalSort(array);
	}
}
