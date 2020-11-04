package br.com.altheusv.sorting;

public enum SortingType {
	SELECTION{
		public SortingStrategy strategy() {
			return new SelectionSort();
		}
	}, 
	INSERTION{
		public SortingStrategy strategy() {
			return new InsertionSort();
		}
	},
	BUBBLE{
		public SortingStrategy strategy() {
			return new BubbleSort();
		}
	},
	MERGE{
		public SortingStrategy strategy() {
			return new MergeSort();
		}
	},
	QUICK{
		public SortingStrategy strategy() {
			return new QuickSort();
		}
	};
	
	public abstract SortingStrategy strategy();
}
