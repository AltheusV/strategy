package br.com.altheusv.sorting;

public class QuickSort implements SortingStrategy{
	
  	public int[] sort(int[] list) {
		System.out.println("This list was sorted using Quick Sort Strategy");			
		sort(list, 0, list.length-1);
		return list;
	}
	
    private void sort(int list[], int low, int high) 
    { 
        if (low < high) 
        { 
            int index = partition(list, low, high); 
            sort(list, low, index-1); 
            sort(list, index+1, high); 
        } 
    }
    
    private int partition(int list[], int low, int high) 
    { 
        int pivot = list[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (list[j] < pivot) 
            { 
                i++;  
                int temp = list[i]; 
                list[i] = list[j]; 
                list[j] = temp; 
            } 
        } 
  
        int temp = list[i+1]; 
        list[i+1] = list[high]; 
        list[high] = temp; 
  
        return i+1; 
    } 
}
