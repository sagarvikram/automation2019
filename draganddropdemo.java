package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//li[@id='credit1']/a"));
		
		WebElement target=driver.findElement(By.xpath("//*[@id='loan']/li"));
		
		act.dragAndDrop(source, target).build().perform();
		WebElement src1=driver.findElement(By.xpath("//*[@id=\"fourth\"][2]//a[contains(text(),' 5000')]"));
		
		WebElement dst1=driver.findElement(By.xpath(" //*[@id=\"amt8\"]/li"));
		act.dragAndDrop(src1, dst1).build().perform();

	}

}
