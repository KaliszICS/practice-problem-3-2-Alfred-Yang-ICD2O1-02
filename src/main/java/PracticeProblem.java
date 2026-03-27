/**
	* Lesson: 3.2 If and Else
	* Author: Alfred Yang
	* Date Created: March 27, 2026
	* Date Last Modified: March 27, 2026
	*/
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println("test");
	}

	public static String isFive(int num){
		String bih = "";
		if (num == 5){
			bih = "The number is Five";
		}
		else{
			bih = "The number is not Five";
		}
		return bih;

	}

	public static String positiveOrNegative(double positron){
		String monkey = "";
		if (positron > 0){
			monkey = "Positive";
		}
		else {
			monkey = "Negative";
		}

		return monkey;
	}

	public static String highOrLow(int non){
		String monkey = "";
		if (non > 100){
			monkey = "High";
		}
		else {
			monkey = "Low";
		}

		return monkey;
	}

	public static String isHello(String con){
		String monkey = "";
		if (con == "Hello"){
			monkey = "The word is Hello";
		}
		else {
			monkey = "The word is not Hello";
		}

		return monkey;
	}



	

}
