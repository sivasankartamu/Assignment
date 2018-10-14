package ganesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("selenium");
		driver.findElement(By.id("uh-search-button")).click();
		getPage("31-40");
	}

	public static void getPage(String pageno) {
		// TODO Auto-generated method stub
		String locator = "//a[@title='Results $']";
		locator = locator.replace("$", pageno);
		driver.findElement(By.xpath(locator)).click();
		

	}

}
