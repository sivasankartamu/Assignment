package ganesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.className("vh79eN")).click();
		Thread.sleep(3000);
		WebElement clik = driver.findElement(By.xpath("//div[text()='3★ & above']"));
		clik.click();
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		myMobile("5");

	}
	public static void myMobile(String index) {
		// TODO Auto-generated method stub
		String locator = "(//img[@class='_1Nyybr  _30XEf0'])($)";
		locator=locator.replaceAll("$", index);
		driver.findElement(By.xpath(locator)).click();

	}

}
