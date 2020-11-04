package br.com.altheusv.sorting;

public class InsertionSort implements SortingStrategy{

	public int[] sort(int[] list)     {        
		System.out.println("This list was sorted using Insertion Sort Strategy");
		for (int i = 1; i < list.length; i++) { 
            int aux = list[i]; 
            int j = i - 1; 
  
            while (j >= 0 && list[j] > aux) { 
                list[j + 1] = list[j]; 
                j = j - 1; 
            } 
            list[j + 1] = aux; 
        }
        return list;
    }
}
