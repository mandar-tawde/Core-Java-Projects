package com.techlabs.exception.custom;
public class NegativeNumberNotSupportedException extends RuntimeException {
	
	private static final long serialVersionUID = 665374199893149069L;
	private String messageString;

	public NegativeNumberNotSupportedException(int number1, int number2) {
		messageString = "Negative Number not supported\nNegative Number";
		if (number1 < 0) {
			if (number2 < 0) {
				messageString = messageString + "s are " + number1 + " and "
						+ number2;
			} else {
				messageString = messageString + " is " + number1;
			}
		} else {
			messageString = messageString + " is " + number2;
		}
	}

	@Override
	public String getMessage() {
		return messageString;
	}

}
