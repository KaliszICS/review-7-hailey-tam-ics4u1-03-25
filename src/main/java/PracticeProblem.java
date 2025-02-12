public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(evenOrOdd(2));
		System.out.println(fartherFromZero(200));
		System.out.println(isFive(5));
		System.out.println(positiveOrNegative(3));
		System.out.println(highOrLow(10));
	}

	//Write your functions here
	public static String evenOrOdd(int num){
		String result;
		if (num%2==0){
			result = "Even";
		}
			else {
				result = "Odd";
			}
			return result;
		}

		public static String teacherOrStudent(String word) {
			String result2;
			if (word == "Kalisz"){
				result2 = "Teacher";
			}
			else {
				result2 = "Student";
			}
			return result2;
		}

		public static int fartherFromZero(int num3) {
			int result3;
			if (num3 > 0) {
				result3 = (num3 + 5);
			}
			if (num3 < 0) {
				result3 = (num3 - 5);
			}
			else {
				result3 = num3;
			}
			return result3;
		}
;
		public static String isFive(int num4) {
			String result4;
			if (num4 == 5){
				result4 = "The number is Five";
			}
			else {
				result4 = "The number is not Five";
			}
			return result4;
		}

		public static String positiveOrNegative(double num5) {
			String result5;
			if (num5 > 0){
				result5 = "Positive";
			}
			else {
				result5 = "Negative";
			}
			return result5;
		}

		public static String highOrLow(int num6) {
			String result6;
			if (num6 > 100){
				result6 = "High";
			}
			else {
				result6 = "Low";
			}
			return result6;	
		}

		public static String isHello(String word) {
			String result7;
			if (word == "Hello"){
				result7 = "The word is Hello";
			}
			else {
				result7 = "The word is not Hello";
			}
			return result7;
		}
		

	}

