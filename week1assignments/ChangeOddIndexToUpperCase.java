package week1assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		String test = "anukul";
		char[] charTest = test.toCharArray();
		System.out.println(charTest);
		
		for(int i=0;i<charTest.length;i++) {
			if(i%2 != 0) {
				System.out.print(Character.toUpperCase(charTest[i]));
			}else {
				System.out.print(charTest[i]);
			}
	   }

   }
}
