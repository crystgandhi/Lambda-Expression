import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagLab2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		double large = Double.MIN_VALUE;
		for (WebElement p : prices) {
			Double price = Double.parseDouble(p.getText().trim().replace("$", ""));
			if (large < price) {
				large = price;
			}
		}System.out.println(large);
		
		String addToCart=("//div[normalize-space()='$"+large+"']/following-sibling::button[text()='Add to cart']");
        driver.findElement(By.xpath(addToCart)).click();
        
        double small = Double.MAX_VALUE;
		for (WebElement p : prices) {
			Double price = Double.parseDouble(p.getText().trim().replace("$", ""));
			if (small > price) {
				small = price;
			}
		}System.out.println(small);
		String addToCart3=("//div[normalize-space()='$"+small+"']/following-sibling::button[text()='Add to cart']");
        driver.findElement(By.xpath(addToCart3)).click();
		
	}

}
