package by.academy.homework3.validate.copy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private Pattern p = Pattern.compile("\\+1[0-9]{7}");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String... args) {
		AmericanPhoneValidator v = new AmericanPhoneValidator();
		System.out.println("+375291000000: " + v.isValid("+375291000000"));
		System.out.println("+175291000000: " + v.isValid("+175291000000"));
		System.out.println("+375291234567: " + v.isValid("+375291234567"));
	}
}
