package runner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pract2 {
  
	@Test
	public static void test() throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Drag and Drop")).click();
//		Actions a = new Actions(driver);
//		a.dragAndDrop(driver.findElement(By.id("column-a")),driver.findElement(By.id("column-b"))).perform();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Dynamic Controls")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
//		driver.findElement(By.xpath("//button[text()='Enable']")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10000));
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='text']"))));
//		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
//		ele.sendKeys("Vignesh");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("./FullScrren.png"));
//		File elesrc = ele.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(elesrc, new File("./elesrc.png"));
		 List<WebElement> broken = driver.findElements(By.tagName("img"));
		 for(WebElement ele : broken) {
			 String link = ele.getAttribute("src");
			 verifyLink(link);
		 }

	        driver.quit();
//		String Parent = driver.getWindowHandle();
//		driver.findElement(By.partialLinkText("Here")).click();
//		Object set[] = driver.getWindowHandles().toArray();
//		for(Object obj : set) {
//			if(!obj.equals(Parent)) {
//				driver.switchTo().window(obj.toString());
//			}
//		}
//		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.findElement(By.xpath("//h3")).getText());
//		driver.close();
//		driver.switchTo().window(Parent);
//		driver.close();
//		System.out.println("Success");
		
		
//		driver.findElement(By.linkText("JavaScript Alerts")).click();
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert al = driver.switchTo().alert();
//		System.out.println(al.getText());
//		al.sendKeys("Vignesh");
//		al.accept();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30000));
//		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//p[@id='result']")), "Vignesh"));
		
		
}
	public static void verifyLink(String url) throws MalformedURLException, IOException {
		
		HttpURLConnection https = (HttpURLConnection) new URL(url).openConnection();
		https.setRequestMethod("HEAD");
		https.connect();
		int responseCode = https.getResponseCode();
		if(responseCode<=400) {
			System.out.println("Not Working "+url);
		}else {
			System.out.println("Working "+url);
		}
		
	}
}