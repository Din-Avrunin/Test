package zzz;

public class Homework {

	public static void main(String[] args) {
		int []arr = {-2,-0,1,3,4,10,12};
		int i=0,j=arr.length-1;
		while (i<j)
		{
			if (arr[i]+arr[j]==0)
			{
				System.out.println("true");
				break;
			}
			else if (arr[i]+arr[j]>0)
				j--;
			else if (arr[i]+arr[j]<0)
				i++;
			
		}		
	}
}
