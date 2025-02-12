public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(evenOrOdd(3));
		System.out.println(teacherOrStudent("Pota"));
		System.out.println(fartherFromZero(200));
		System.out.println(isFive(3));
		System.out.println(positiveOrNegative(-3));
		System.out.println(highOrLow(101));
		System.out.println(isHello("Hello"));
		System.out.println(evenOrOdd(4));
		System.out.println(teacherOrStudent("Kallisz"));
		System.out.println(fartherFromZero(-5));
		System.out.println(isFive(5));
		System.out.println(positiveOrNegative(4));
		System.out.println(highOrLow(100));
		System.out.println(isHello("Bye"));
		System.out.println(fartherFromZero(0));
	}

	//Write your functions here
	public static String evenOrOdd(int num){
		if (num%2==0){
			return "Even";
		}
			else {
				return "Odd";
			}
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
			if (num3 > 0) {
				return num3 + 5;
			}
			else if (num3 < 0) {
				return num3 - 5;
			}
			else {
				return num3;
			}
		}
;
		public static String isFive(int num4) {
			if (num4 == 5){
				return "The number is Five";
			}
			else {
				return "The number is not Five";
			}
		}

		public static String positiveOrNegative(double num5) {
			if (num5 > 0){
				return "Positive";
			}
			else {
				return "Negative";
			}
		}

		public static String highOrLow(int num6) {
			if (num6 > 100){
				return "High";
			}
			else {
				return "Low";
			}
		}

		public static String isHello(String word) {
			if (word == "Hello"){
				return "The word is Hello";
			}
			else {
				return "The word is not Hello";
			}
		}
	}
