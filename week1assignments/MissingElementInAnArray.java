package week1assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,7,8};
		Arrays.sort(arr);
		int n=0;
		for (int i=0;i<arr.length;i++)
		{
			if(i+1!=arr[i])
			{
				n=i+1;
				System.out.println("Missing Element in array is :"  + n);
			
			}
			
		}
		
	}
}