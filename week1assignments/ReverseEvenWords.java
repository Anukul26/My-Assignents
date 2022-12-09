package week1assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester and a working professional!";
		 String[] textArr = test.split(" ");
		 
		 for(int i=0;i<textArr.length;i++) {
			 if(i%2==0 && textArr[i].length() > 1) {
				 char[] eachWord = textArr[i].toCharArray();
				 String reversedWord = "";
				 for(int j=eachWord.length-1;j>0;j--) {
					 reversedWord += eachWord[j];
				 }
				 System.out.print(reversedWord + " ");
			 }else {
				 System.out.print(textArr[i] + " ");
			 }
		 }
	}

}
