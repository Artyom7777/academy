package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ApplicationTask2 {
	
	public static void main(String... args) {
		
		Class<User> refUser = User.class;
		
		User firstUser = new User("mikemike", "mike1985", "mkbond@gmail.com");
		
		System.out.println("--------------------------No Declared--------------------------------");
		
		try {
			Method metd = refUser.getMethod("printUserInfo");
			System.out.println("Name of the method: " + metd.getName());			
		} catch (NoSuchMethodException | SecurityException e1) {
			System.out.println(" Methods are missing! ");
		}
		
		Method[] method = refUser.getMethods();
		System.out.println("User methods: ");
		for (Method meth : method) {
			System.out.println(meth.getName());
		}
		
		try {
			Field field = refUser.getField("login");
			String log = (String) field.get(firstUser);
			System.out.println("User login: " + log);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		Field[] fields = refUser.getFields();
		System.out.println("User fields: ");
		for (Field fils : fields) {
			System.out.println(fils.getName());
		}
		
		System.out.println("-----------------------------Declared--------------------------------");

		try {
			Method declareMethod = refUser.getDeclaredMethod("printUserInfo");
			System.out.println("DeclaredMethod name: " + declareMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method[] declareMethods = refUser.getDeclaredMethods();
		System.out.println("Declared methods: ");
		for (Method meth : declareMethods) {
			System.out.println(meth.getName());
		}

		try {
			Field declaredField = refUser.getDeclaredField("password");
			declaredField.setAccessible(true);
			String password = (String) declaredField.get(firstUser);
			System.out.println("Declared password: " + password);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Field[] field = refUser.getDeclaredFields();
		System.out.println("Declared User fields: ");
		for (Field fiel : field) {
			System.out.println(fiel.getName());
		}

		System.out.println("--------------------------Set | Get--------------------------------");

		try {
			Field setField = refUser.getDeclaredField("password");
			setField.setAccessible(true);
			setField.set(firstUser, "nike543");
			String password = (String) setField.get(firstUser);
			System.out.println("New password: " + password);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field setField = refUser.getDeclaredField("login");
			setField.setAccessible(true);
			setField.set(firstUser, "nikenike");
			String login = (String) setField.get(firstUser);
			System.out.println("New login: " + login);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field setField = refUser.getDeclaredField("email");
			setField.setAccessible(true);
			setField.set(firstUser, "nkNeBond@gmail.com");
			String email = (String) setField.get(firstUser);
			System.out.println("New email: " + email);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------invoke--------------------------------");
		
		try {
			Method declareMethod = refUser.getDeclaredMethod("printUserInfo");
			declareMethod.setAccessible(true);
			declareMethod.invoke(firstUser);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}	
}


