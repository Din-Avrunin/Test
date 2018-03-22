import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr [] = {5,1,7,8,2};
		Sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void Sort(int[] arr, int l, int r) {

		if (l<r)
		{
			int m=(r+l)/2;
			Sort(arr,l,m);
			Sort(arr,m+1,r);
			Merge(arr,l,m,r);
		}

	}

	private static void Merge(int[] arr, int l, int m, int r) {

		int n1 = m-l+1;
		int n2 = r-m;

		int [] L = new int[n1];
		int [] R = new int[n2];

		for (int i = 0;i<n1;i++)
			L[i]=arr[i+l];	
		for (int j=0;j<n2;j++)
			R[j]=arr[m+1+j];
		int i=0, j =0, k = l;
		while (i<n1 && j<n2)
		{
			if (L[i]<=R[j])
				arr[k++]=L[i++];
			else
				arr[k++]=R[j++];
		}

		for (;i<n1;i++) arr[k++] = L[i];
		for (;j<n2;j++) arr[k++] = R[j];



	}

}
