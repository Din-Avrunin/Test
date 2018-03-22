import java.util.Arrays;

public class Merging {


	public static void main(String[] args) {

		int[] arr = {1,2,312,3,123,124,12,412,512,4};
		Sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void Sort(int [] arr,int l,int r)
	{
		if (l<r)
		{
			int m = (l+r)/2;
			Sort(arr,l,m);
			Sort(arr,m+1,r);
			Merge(arr,l,m,r);
		}
	}

	private static void Merge(int[] arr, int l, int m, int r) {

		
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for (int i = 0;i<n1;i++)
			L[i]=arr[i+l];
		for (int j =0;j<n2;j++)
			R[j]=arr[j+m+1];
		
		
	}
}
