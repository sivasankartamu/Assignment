package velmurugan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Base {
	public static WebDriver driver;
	@Before(order=0)
	public static WebDriver driver(String name) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(name);
		return driver;
	}
	@Before(order=1)
	public static void type(WebElement element,String name) {
		// TODO Auto-generated method stub
		element.sendKeys(name);

	}
	@Before(order=3)
	public static void click(WebElement element) {
		element.click();
	}
	@Before(order=3)
	public static void selc(WebElement element,String name) {
		// TODO Auto-generated method stub
		new Select(element).selectByVisibleText(name);

	}
	@After
	public static void quit() {
		// TODO Auto-generated method stub
		driver.close();

	}
	
	

}
