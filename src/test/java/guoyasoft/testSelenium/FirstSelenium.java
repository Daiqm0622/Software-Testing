package guoyasoft.testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");
		WebElement query = driver.findElement(By.xpath("//input[@id='kw']"));
		query.sendKeys(new String[] { "NBA" });
		WebElement su = driver.findElement(By.xpath("//input[@id='su']"));
		su.click();
        driver.close();
	}
}
