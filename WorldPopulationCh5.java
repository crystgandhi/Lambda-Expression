import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorldPopulationCh5 {
	static WebDriver driver;
	
	static String populationLocator=("//div[@class='maincounter-number']");
	static String todayData=("//div[text()='Today']//parent::div//span[@class='rts-counter']");
	static String DatathisYear=("//div[text()='This year']//parent::div//span[@class='rts-counter']");
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.get("https://www.worldometers.info/world-population/");
		int count=0;
		while (count<=10) {
			if(count==10) break;
		getPopulationData(populationLocator);
		System.out.println("******************************************");
		getPopulationData(todayData);
		System.out.println("******************************************");
		getPopulationData(DatathisYear);
		count++;
		}
	}
	public static void getPopulationData(String locator) {
			List<WebElement> population=driver.findElements(By.xpath(locator));
			Iterator<WebElement>value=population.iterator();
			while(value.hasNext()) {
				System.out.println(value.next().getText());
			}
		
	}

}
