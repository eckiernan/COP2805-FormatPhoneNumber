
public class TestNumber {

	public static void main(String[] args) {

		PhoneNumber number1 = new PhoneNumber("407.182.2213");
		PhoneNumber number2 = new PhoneNumber("4072822213");
		PhoneNumber number3 = new PhoneNumber("1 407 382-2213");
		PhoneNumber number4 = new PhoneNumber("14074822213");

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);

	}

}
