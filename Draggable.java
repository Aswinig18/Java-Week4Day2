package weekfour.day2assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions Builder=new Actions(driver);
		WebElement item1=driver.findElement(By.id("draggable"));
		
		Builder.dragAndDropBy(item1, 100,100).perform();
		

	}

}
