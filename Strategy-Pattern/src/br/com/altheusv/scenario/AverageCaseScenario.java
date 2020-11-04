package br.com.altheusv.scenario;

import br.com.altheusv.sorting.BubbleSort;
import br.com.altheusv.sorting.InsertionSort;
import br.com.altheusv.sorting.MergeSort;
import br.com.altheusv.sorting.QuickSort;
import br.com.altheusv.sorting.SelectionSort;

public class AverageCaseScenario {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		String sortType = "Selection";
		//String sortType = "Insertion";
		//String sortType = "Bubble";
		//String sortType = "Merge";
		//String sortType = "Quick";

		int[] list = {12,25,64,22,11};
		//int[] list = {64, 34, 25, 12, 22, 11, 90};
		//int[] list = {7, 0, 6, 1, 4, 2, 5, 3, 8};
		//int[] list = {1, 2, 3, 4, 8, 7, 6, 4 ,9, 10, 11, 12 ,13 ,14 ,15, 16 ,17, 18, 19, 20};		// TODO Auto-generated method stub

		if(sortType.equals("Selection")) {
			SelectionSort s = new SelectionSort();
			s.sort(list);
		}
		else if (sortType.equals("Insertion")){
			InsertionSort i = new InsertionSort();
			i.sort(list);
		}
		else if (sortType.equals("Bubble")) {
			BubbleSort b = new BubbleSort();
			b.sort(list);
		}
		else if (sortType.equals("Merge")){
			MergeSort m = new MergeSort();
			m.sort(list);
		}
		else if (sortType.equals("Quick")) {
			QuickSort q = new QuickSort();
			q.sort(list);
		}
		
		print(list);
		long endTime = System.nanoTime();
		System.out.println("Execution time in nanoseconds  : " + (endTime - startTime));
	}
	
	public static void print(int[] list){
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}
