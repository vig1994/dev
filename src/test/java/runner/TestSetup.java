package runner;
import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TestSetup {
	 public static void main(String[] args) {
		 try {
			 WebDriver delegate = new ChromeDriver();
		        SelfHealingDriver driver = SelfHealingDriver.create(delegate);

		        driver.get("https://example.com");
		        driver.findElement(By.id("oldLocator")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	        
	    }
}
