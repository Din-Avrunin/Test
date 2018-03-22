import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
	int [] arr = {12,11,13,5,2,7};
	sort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
}
	public static void sort(int [] arr, int l, int r)
	{
		if (l<r)
		{
			int middle = (r+l)/2;
			sort(arr,l,middle);
			sort(arr,middle+1,r);
			merge(arr,l,middle,r);
		}
	}
	private static void merge(int[] arr, int l, int m, int r) {
	
		int n1 = m-l+1;
		int n2 = r-m;
		
		int [] L = new int[n1];
		int [] R = new int[n2];
		
		for (int i=0;i<n1;++i)
			L[i]=arr[i+l];
		for (int j=0;j<n2;++j)
			R[j]=arr[m+j+1];
		
		int k=l,i=0,j=0;
		while (i < n1 && j < n2)
		{
		if (L[i] <= R[j])
			arr[k++] = L[i++];
		else
			arr[k++] = R[j++];
		}
		while (i<n1) arr[k++] = L[i++];
		while (j<n2) arr[k++] = R[j++];
		
			
	}
}
