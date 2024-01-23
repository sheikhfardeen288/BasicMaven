package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TiraTest {

	@Test 
	public void luanchTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
		WebElement searchtf = driver.findElement(By.id("search"));
		searchtf.sendKeys("perfume");
		searchtf.sendKeys(Keys.ENTER);

}
}
