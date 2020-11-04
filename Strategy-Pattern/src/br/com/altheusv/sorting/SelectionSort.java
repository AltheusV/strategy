package br.com.altheusv.sorting;

public class SelectionSort implements SortingStrategy {

	public int[] sort(int[] list) {		
		System.out.println("This list was sorted using Selection Sort Strategy");
		int min, aux;
		
		for(int i = 0; i<list.length-1; i++) {
			min = i;
			for(int j = i+1; j<list.length; j++) {
				if(list[j]<list[min]) {
					min = j;
				}
			}
			aux = list[i];
			list[i] = list[min];
			list[min] = aux;
		}		
		return list;
	}	
}
