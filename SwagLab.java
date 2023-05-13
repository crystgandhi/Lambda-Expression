import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagLab {

	public static void main(String[] args) throws InterruptedException {
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
		Double maxPrice = prices.stream().mapToDouble(p -> Double.parseDouble(p.getText().trim().replace("$", "")))
				.max().getAsDouble();
        String addToCart=("//div[normalize-space()='$"+maxPrice+"']/following-sibling::button[text()='Add to cart']");
        driver.findElement(By.xpath(addToCart)).click();
        
     Double minPrice=   prices.stream().mapToDouble(p->Double.parseDouble(p.getText().trim().replace("$", ""))).min().getAsDouble();
     String addToCart2=("//div[normalize-space()='$"+minPrice+"']/following-sibling::button[text()='Add to cart']");
     driver.findElement(By.xpath(addToCart2)).click();
     // driver.close();

	}

}
