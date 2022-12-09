package week1assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Anu656kul";
		int sum = 0;
		char[] textArray = text.toCharArray();
		for(int i=0;i<textArray.length;i++) {
			if(Character.isDigit(textArray[i])) {
				sum += Character.getNumericValue(textArray[i]);
		}
	}
		System.out.println("Sum of the digits in the given string is \'" + sum + "\'");
	}

}
