import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CodeCh1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.get("https://www.makemytrip.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/p/a")).click();
		driver.findElement(By.cssSelector(".multiDropDownVal")).click();
		driver.findElement(By.cssSelector(".dropDownList li:nth-child(1)")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("che");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(@id, 'item-0')]")).click();
		Thread.sleep(10000);
		/*
		 * driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("del");
		 * Thread.sleep(5000);
		 * driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0")).
		 * click();
		 */
		driver.findElement(By.id("departure")).click();
		driver.findElement(By.xpath("//div[@role='grid'][1]/div/div[2]/div[4]/div")).click();
		driver.findElement(By.id("return")).click();
		driver.findElement(By.xpath("//div[@role='grid'][2]/div[3]/div[3]/div[6]")).click();
		driver.findElement(By.xpath("//button[@id='search-button']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		List<WebElement>flights=driver.findElements(By.xpath("//label[contains(@id,'flightCard')]"));
		System.out.println(flights.size());
		//chennai to NewDelhi
		List<WebElement>flightNameLhs=driver.findElements(By.xpath("//div[@class='splitVw']/div[1]/div[2]/div/div"));
		Thread.sleep(3000);
		System.out.println(flightNameLhs.size());
		//NewDelhi to Chennai 
		List<WebElement>flightNameRhs=driver.findElements(By.xpath("//div[@class='splitVw']/div[2]/div[2]/div/div"));
		Thread.sleep(3000);
		System.out.println(flightNameRhs.size());
	}

}
