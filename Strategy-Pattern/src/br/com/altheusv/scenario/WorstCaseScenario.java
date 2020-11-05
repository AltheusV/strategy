package br.com.altheusv.scenario;

public class WorstCaseScenario {

	public static void main(String[] args) {
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
		}
		else if(sortType.equals("Insertion")){
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
		}
		else if(sortType.equals("Bubble")) {
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
		}
		else if(sortType.equals("Merge")) {
			System.out.println("This list was sorted using Merge Sort Strategy");				
			mergeSort(list, 0, list.length-1);		
		}
		else if(sortType.equals("Quick")){
			System.out.println("This list was sorted using Quick Sort Strategy");			
			quickSort(list, 0, list.length-1);
		}
		
		print(list);
	}
	
	private static void mergeSort(int[] list, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            
            mergeSort(list, l, m);
            mergeSort(list, m + 1, r);
            
            merge(list, l, m, r);
        }
	}
	
	private static void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
    private static void quickSort(int list[], int low, int high) 
    { 
        if (low < high) 
        { 
            int index = partition(list, low, high); 
            quickSort(list, low, index-1); 
            quickSort(list, index+1, high); 
        } 
    }
    
    private static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }
    
	public static void print(int[] list){
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}
