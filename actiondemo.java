package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		// Double Click
		WebElement dblbutton=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dblbutton).build().perform();
		//act.doubleClick(dblbutton).build().perform();
		driver.switchTo().alert().accept();
		// Right Click (Context click)
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).build().perform();
		driver.findElement(By.xpath("//div[@id='rightclickItem']//div[contains(text(),'Edit this')]")).click();
		driver.switchTo().alert().accept();

	}

}
