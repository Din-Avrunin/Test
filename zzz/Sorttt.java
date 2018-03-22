package zzz;

import java.util.Arrays;

class Sorttt
{

	
	public static void MergeSort(int arr[],int left,int right)
	{

		if (left< right)
		{
		int middle = (left+right)/2;
		MergeSort(arr,left,middle);
		MergeSort(arr,middle+1,right);
		Sort(arr,left,right);
		}
	}
	
	
	
	
private static void Sort(int[] arr, int low, int high) 
{
		
	int n = high - low;
	if (n<=1) return;
	int mid= (low + high) /2;
	Sort(arr,low,mid);
	Sort(arr,mid,high);
	int [] T = new int[arr.length];
	int i = low,j=mid,k=0;
	while (i<mid && j<high)
	{
		if (arr[j] < arr[i])
			T[k++] = arr[j++];
		else
			T[k++] = arr[i++];
	}
	while (i<mid) T[k++] = arr[i++];
	while (j<high) T[k++] = arr[j++];
	for (int p=0;p<high-low;p++) arr[low+p] =T[p];

	
		
	}




public static void main(String[] args) {
	
	int arr[] = { 5,1,4,2,10,3,9,15};
	
//	for (int i=0;i<arr.length;i++)

//		arr[i]=(int)(Math.random()*10);
	
	System.out.println("Original array is: "+Arrays.toString(arr));
	MergeSort(arr,0,arr.length);
	System.out.println(" array is: "+Arrays.toString(arr));
	}
}