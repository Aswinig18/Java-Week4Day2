package weekfour.day2assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions Builder=new Actions(driver);
		WebElement courseTitle=driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		Builder.moveToElement(courseTitle).perform();
		String course=driver.findElement(By.xpath("(//a[@class='listener'])[1]")).getText();
		System.out.println(course);
		String course2=driver.findElement(By.xpath("(//a[@class='listener'])[2]")).getText();
		System.out.println(course2);
		String course3=driver.findElement(By.xpath("(//a[@class='listener'])[3]")).getText();
		System.out.println(course3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='listener'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		

	}

}
