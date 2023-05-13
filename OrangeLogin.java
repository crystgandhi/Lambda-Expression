import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
public class OrangeLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul li:nth-child(3) a")).click();
		WebElement itag=driver.findElement(By.cssSelector("form:first-child div:first-child div:first-child div:nth-child(4) i "));
		itag.click();
		List <WebElement> levtyp=driver.findElements(By.cssSelector("form div:first-child div div:nth-child(4) div div:nth-child(2) div div div:first-child"));
		Thread.sleep(5000);
		System.out.println(levtyp.size());
		levtyp.get(0).sendKeys("CAN-Bereavement");
		driver.close();
		
		/*
		 * JavascriptExecutor executor=(JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", levtyp);
		 * //executor.executeScript(
		 * "document.getElementByXpath.value='CAN-Bereavement')");
		 * 
		 * //levtyp.click(); //driver.close();
		 */
	}

}
