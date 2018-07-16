/**
 * @param PhoneNumber
 * class creates guidelines for formatting of a phone number.
 */

public class PhoneNumber {

	private String areaCode;
	private String exchange;
	private String localNumber;

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	/**
	 * Constructor excludes input symbols "([.-])" and puts number into toString
	 * format. Acceptable phone number examples : 1234567890 ; 123-456-7890; 1
	 * 1234567890; (123) 4567890; 123.456.7890. All will be formatted to (123)
	 * 456-7890
	 */

	public PhoneNumber(String number) {
		number = number.replaceAll("([.-])", "");
		number = number.replaceAll(" ", "");
			
		
		if (number.length() == 10) {
			areaCode = number.substring(0, 3);
			exchange = number.substring(3, 6);
			localNumber = number.substring(6, 10);
		} else {
			if (number.length() == 11 & number.charAt(0) == 1) {
				areaCode = number.substring(1, 4);
				exchange = number.substring(4, 7);
				localNumber = number.substring(7, 11);
			} else {
				areaCode = number.substring(1, 4);
				exchange = number.substring(4, 7);
				localNumber = number.substring(7, 11);
			}
		}
	}

	public String toString() {
		String result;
		result = "(" + areaCode + ") " + exchange + "-" + localNumber;
		return result;
	}

}
