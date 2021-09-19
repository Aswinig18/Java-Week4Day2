package weekfour.day2assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortableU1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions Builder=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item5= driver.findElement(By.xpath("//li[text()='Item 5']"));
		Point Location=item5.getLocation();
		int x=Location.getX();
		int y=Location.getY();
		Builder.dragAndDropBy(item1, x, y).perform();

	}

}
