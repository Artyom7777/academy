package by.academy.homework3.validate.copy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator{
	
	public Pattern p = Pattern.compile("^\\d{1,2}\\.\\d{1,2}\\.\\d{4}$");
	public Pattern w = Pattern.compile("^\\d{1,2}-\\d{1,2}-\\d{4}$");
	
	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		Matcher z = w.matcher(s);
		return m.find() || z.find() || false;
	}

}
