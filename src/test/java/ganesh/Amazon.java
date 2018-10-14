package ganesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='4 Stars & Up']")).click();
		getMob("5");

	}

	public static void getMob(String pag) throws Throwable  {
		// TODO Auto-generated method stub
		String locator = "//li[@data-result-rank='$']";
		locator = locator.replace("$", pag);
		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();

	}

}
