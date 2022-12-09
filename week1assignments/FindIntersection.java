package week1assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray = {1,5,99,121,1111,0};
		int secondArray[] = {121,5,0,2,3,4};
		
		for(int i=0;i<firstArray.length;i++) {
			for(int j=0;j<secondArray.length;j++) {
				if(firstArray[i] == secondArray[j]) { 
					System.out.print(firstArray[i] + " ");
					break;
	            }
			}
		}
   }
}