import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class NewFeatures {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1440, 900));
		
		//launch the application and login Page
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		WebElement textLabel=driver.findElement(with(By.tagName("Label")).above(nameEditBox));
	    System.out.println(textLabel.getText());
	    
	    WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
	    WebElement dateEntry=driver.findElement(with(By.tagName("input")).below(dob));
	    dateEntry.click();
	    
	    WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

	    driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

	    WebElement rdb = driver.findElement(By.id("inlineRadio1"));

	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());


		
	    
	    
	}

}
