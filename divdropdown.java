package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class divdropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://formy-project.herokuapp.com/dropdown");
	driver.manage().window().maximize();
	WebElement dropdownbtn=driver.findElement(By.id("dropdownMenuButton"));
	dropdownbtn.click();
	driver.findElement(By.xpath("//a[contains(text(),'File Download')]")).click();
}
}
