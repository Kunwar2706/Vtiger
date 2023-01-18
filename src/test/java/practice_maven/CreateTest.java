package practice_maven;

import org.testng.annotations.Test;

public class CreateTest {
	@Test
	public void createLogin() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String passwoord = System.getProperty("password");

		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(passwoord);
	}
}
