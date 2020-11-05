package br.com.altheusv.context;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.altheusv.sorting.BubbleSort;
import br.com.altheusv.sorting.InsertionSort;
import br.com.altheusv.sorting.MergeSort;
import br.com.altheusv.sorting.QuickSort;
import br.com.altheusv.sorting.SelectionSort;
import br.com.altheusv.sorting.SortingStrategy;

public class StrategyContext {
		
	public static void main(String[] args) {
		
		List <SortingStrategy> strategy = new ArrayList<>();
		
		strategy.add(new SelectionSort()); //0
		strategy.add(new InsertionSort()); //1
		strategy.add(new BubbleSort()); //2
		strategy.add(new MergeSort()); //3
		strategy.add(new QuickSort()); //4
		
		int[] list = {12,25,64,22,11};
		//int[] list = {64, 34, 25, 12, 22, 11, 90};
		//int[] list= {7, 0, 6, 1, 4, 2, 5, 3, 8};
		//int[] list = {1, 2, 3, 4, 8, 7, 6, 4 ,9, 10, 11, 12 ,13 ,14 ,15, 16 ,17, 18, 19, 20};
		
		Scanner scn = new Scanner(System.in);
		int index = scn.nextInt();
		sort(strategy.get(index), list);
		print(list);
		scn.close();

	}
	
	public static int[] sort(SortingStrategy s, int[] list) {
		return s.sort(list);
	}
	
	public static void print(int[] list){
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}
