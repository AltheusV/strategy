package br.com.altheusv.sorting;

public class BubbleSort implements SortingStrategy{
		
	public int[] sort(int[] list) {
		System.out.println("This list was sorted using Bubble Sort Strategy");
		
		int aux;
		
		for(int i = 0; i<list.length-1; i++) {
			for(int j = 0; j<list.length-i-1; j++) {
				if(list[j]>list[j+1]){
					aux = list[j];
					list[j] = list[j+1];
					list[j+1] = aux;
				}
			}
		}		
		return list;
	}

}
