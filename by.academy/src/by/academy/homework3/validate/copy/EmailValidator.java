package by.academy.homework3.validate.copy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private Pattern regExp = Pattern.compile("^[\\._\\-a-zA-Z0-9]+@[\\._\\-a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,}$");

	@Override
	public boolean isValid(String s) {
		Matcher m = regExp.matcher(s);
		return m.find();
	}

	public static void main(String... args) {
		EmailValidator v = new EmailValidator();
		System.out.println("iartiq@gmail.com " + v.isValid("iartiq@yahoo.com"));
		System.out.println("yrnata_gyr@mail.ru " + v.isValid("yrnata_gyr@mail.ru"));
		System.out.println("5$gyri@yahoo.com " + v.isValid("5$gyri@yahoo.com"));
	}
}